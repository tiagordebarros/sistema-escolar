import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfaceDoUsuario {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de alunos
        ListaDeAlunos listaDeAlunos = new ListaDeAlunos();

        // Lista de turmas
        List<Turma> turmas = new ArrayList<>();

        // Menu de opções
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Turma");
            System.out.println("3. Matricular Aluno em Turma");
            System.out.println("4. Listar Alunos em Ordem Alfabética");
            System.out.println("5. Listar Turmas");
            System.out.println("6. Listar Alunos Matriculados em Uma Turma");
            System.out.println("7. Listar Alunos Fora da Idade Prevista de Uma Etapa");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    // Cadastrar aluno
                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF do aluno: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Endereço do aluno: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Data de nascimento do aluno (AAAA-MM-DD): ");
                    String dataNascimentoStr = scanner.nextLine();
                    LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
                    try {
                        Aluno aluno = new Aluno(nome, cpf, endereco, dataNascimento);
                        listaDeAlunos.incluirNoFim(aluno);
                    } catch (ExcecaoDeAlunoJaExistente e) {
                        System.out.println("Erro ao inserir aluno: " + e.getMessage());
                    }
                    break;
                case 2:
                    // Cadastrar turma
                    System.out.print("Código da turma: ");
                    int codigoDaTurma = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Etapa de ensino (infantil, fundamental anos iniciais, fundamental anos finais, médio): ");
                    String etapaDeEnsino = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    System.out.print("Limite de vagas: ");
                    int limiteDeVagas = scanner.nextInt();
                    System.out.print("Número de Matriculados: ");
                    int numeroDeMatriculados = scanner.nextInt();
                    Turma turma = new Turma(codigoDaTurma, etapaDeEnsino, ano, limiteDeVagas, numeroDeMatriculados);
                    turmas.add(turma);
                    System.out.println(turmas);
                    System.out.println("Turma cadastrada com sucesso!");
                    break;
                case 3:
                    // Matricular aluno em turma
                    System.out.println("Nome do aluno: ");
                    String nomeAlunoParaMatricula = scanner.nextLine();
                    System.out.println("Número da turma: ");
                    int numeroTurmaParaMatricula = scanner.nextInt();
                    scanner.nextLine();

                    // Validar se a turma existe
                    Turma turmaParaMatricula = null;
                    for (Turma turmaAlunos : turmas) {
                        int codigoTurma = turmaAlunos.getCodigoDaTurma();
                        if (codigoTurma == numeroTurmaParaMatricula) {
                            turmaParaMatricula = turmaAlunos;
                            break;
                        }
                    }
                    if (turmaParaMatricula == null) {
                        System.out.println("O código da turma informado não existe!");
                        break;
                    }

                    // Validar se o aluno foi cadastrado
                    Aluno alunoParaMatricula = null;
                    for (Aluno alunoDaTurma : listaDeAlunos.getAlunos()) {
                        String nomeAluno = alunoDaTurma.getNome();
                        if (nomeAluno.equals(nomeAlunoParaMatricula)) {
                            alunoParaMatricula = alunoDaTurma;
                            break;
                        }
                    }
                    if (alunoParaMatricula == null) {
                        System.out.println("O nome do aluno informado não existe!");
                        break;
                    }

                    turmaParaMatricula.getAlunosMatriculados().add(alunoParaMatricula);
                    System.out.println("Aluno matriculado com sucesso!");
                    break;
                case 4:
                    // Listar alunos em ordem alfabética
                    listaDeAlunos.ordenar();
                    break;
                case 5:
                    // Listar todas as turmas
                    System.out.println("Turmas cadastradas:");
                    System.out.println(turmas);
                    break;
                case 6:
                    // Listar alunos matriculados em uma turma
                    System.out.print("Número da turma: ");
                    int numeroTurmaListar = scanner.nextInt();
                    scanner.nextLine();

                    // Encontrar a turma correspondente ao número fornecido
                    Turma turmaParaListar = null;
                    for (Turma turmaAlunos : turmas) {
                        if (turmaAlunos.getCodigoDaTurma() == numeroTurmaListar) {
                            turmaParaListar = turmaAlunos;
                            break;
                        }
                    }

                    if (turmaParaListar == null) {
                        System.out.println("O número da turma informado não existe!");
                    } else {
                        List<Aluno> alunosMatriculados = turmaParaListar.getAlunosMatriculados();
                        if (alunosMatriculados.isEmpty()) {
                            System.out.println("Nenhum aluno matriculado nesta turma.");
                        } else {
                            System.out.println("Alunos matriculados na turma " + numeroTurmaListar + ":");
                            for (Aluno estudante : alunosMatriculados) {
                                System.out.println(estudante);
                            }
                        }
                    }
                    break;
                case 7:
                    // Listar alunos fora da idade prevista em uma turma
                    System.out.print("Número da turma: ");
                    int numeroTurmaIdade = scanner.nextInt();
                    scanner.nextLine();
                
                    // Encontrar a turma correspondente ao número fornecido
                    Turma turmaParaIdade = null;
                    for (Turma turmaAlunos : turmas) {
                        if (turmaAlunos.getCodigoDaTurma() == numeroTurmaIdade) {
                            turmaParaIdade = turmaAlunos;
                            break;
                        }
                    }
                
                    if (turmaParaIdade == null) {
                        System.out.println("O número da turma informado não existe!");
                    } else {
                        List<Aluno> alunosMatriculados = turmaParaIdade.getAlunosMatriculados();
                        if (alunosMatriculados.isEmpty()) {
                            System.out.println("Nenhum aluno matriculado nesta turma.");
                        } else {
                            System.out.println("Alunos fora da idade prevista na turma " + numeroTurmaIdade + ":");
                            for (Aluno estudante : alunosMatriculados) {
                                int idadeAluno = estudante.getIdade();
                                switch (turmaParaIdade.getEtapaDeEnsino()) {
                                    case "infantil":
                                        if (idadeAluno >= 6) {
                                            System.out.println(estudante);
                                        }
                                        break;
                                    case "fundamental anos iniciais":
                                        if (!(idadeAluno >= 6 && idadeAluno <= 11)) {
                                            System.out.println(estudante);
                                        }
                                        break;
                                    case "fundamental anos finais":
                                        if (!(idadeAluno >= 11 && idadeAluno <= 15)) {
                                            System.out.println(estudante);
                                        }
                                        break;
                                    case "médio":
                                        if (!(idadeAluno >= 15 && idadeAluno <= 18)) {
                                            System.out.println(estudante);
                                        }
                                        break;
                                    default:
                                        System.out.println("Erro: Etapa de ensino desconhecida.");
                                }
                            }
                        }
                    }
                    break;
                case 8:
                    // Sair
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.\n");
            }
        } while (opcao != 8);
        scanner.close();
    }
}

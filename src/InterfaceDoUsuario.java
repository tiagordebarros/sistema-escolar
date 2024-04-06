import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfaceDoUsuario {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de alunos
        ListaDeAlunos listaDeAlunos = new ListaDeAlunos();

        // Lista de turmas
        List<Turma> turmas = new ArrayList<>();
        // Turma listaDeTurmas = new Turma();

        // Menu de opções
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Turma");
            System.out.println("3. Matricular Aluno em Turma");
            System.out.println("4. Listar Alunos em Ordem Alfabética");
            System.out.println("5. Listar Turmas");
            System.out.println("6. Listar Alunos Matriculados em uma Turma");
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
                    Aluno aluno = new Aluno(nome, cpf, endereco, dataNascimento);
                    listaDeAlunos.incluirNoFim(aluno);
                    break;
                case 2:
                    // Cadastrar turma
                    System.out.print("Código da turma: ");
                    int codigoDaTurma = scanner.nextInt();
                    scanner.nextLine();  // Limpar o buffer do scanner
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

                    default:
                    System.out.println("Opção inválida.\n");
                case 3:
                    // Matricular aluno em turma
                    // listaDeAlunos.matricular();
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
            }
        } while (opcao != 8);
        scanner.close();
    }
}
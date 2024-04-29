import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ListaDeAlunos {
  private List<Aluno> alunos;

  public ListaDeAlunos() {
      this.alunos = new ArrayList<>();
  }

  public void incluirNoInicio(Aluno aluno) throws ExcecaoDeAlunoJaExistente {
      if (alunos.contains(aluno)) {
        throw new ExcecaoDeAlunoJaExistente("O CPF informado já existe na lista.");
      }
      alunos.add(0, aluno);
      System.out.println(alunos);
      System.out.println("Aluno adicionado com sucesso!");
  }

  public void incluirNoFim(Aluno aluno) throws ExcecaoDeAlunoJaExistente {
      if (alunos.contains(aluno)) {
        throw new ExcecaoDeAlunoJaExistente("O CPF informado já existe na lista.");
      }
      alunos.add(aluno);
      System.out.println(alunos);
      System.out.println("Aluno cadastrado com sucesso!");
  }

  public void ordenar() {
      alunos.sort(Comparator.comparing(Aluno::getNome));
      System.out.println(alunos);
      System.out.println("Alunos ordenados com sucesso!");
  }

  public Aluno removerDoFim() {
    if (alunos.isEmpty()) {
      System.out.println("A lista de alunos está vazia.");
      return null;
  }
  return alunos.remove(alunos.size() - 1);
  }

  public int tamanho() {
    return alunos.size();
  }

  public Aluno get(int index) {
    if (index < 0 || index >= alunos.size()) {
      System.out.println("Índice inválido.");
      return null;
    }
    return alunos.get(index);
  }

  public List<Aluno> getAlunos() {
      return alunos;
  }
}

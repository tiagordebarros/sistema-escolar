// import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
// import java.util.Arrays;
import java.util.List;

public class ListaDeAlunos {
  private List<Aluno> alunos;
  // private Aluno[] alunos;
  // public static void main(String[] args) {
  //   Aluno[] alunos = {
  //     new Aluno("John Doe", "123.456.789-00","Rua Sem Nome",LocalDate.of(1990,11,12)), 
  //     new Aluno("Joana Doe","321.654.987-11","Rua Sem Número",LocalDate.of(2000,06,10))
  //   };

  //   System.out.println(Arrays.toString(alunos));
  // }

  public ListaDeAlunos() {
    this.alunos = new ArrayList<>();
  }
  
  // inclui um Aluno no início da lista
  // public void incluirNoInicio(Aluno aluno) {
  //   Aluno[] novaLista = new Aluno[alunos.length + 1];
  //   novaLista[0] = aluno;
  //   System.arraycopy(alunos, 0, novaLista, 1, alunos.length);
  //   alunos = novaLista;
  // }

  public void incluirNoInicio(Aluno aluno) {
    alunos.add(0, aluno);
    System.out.println(alunos);
    System.out.println("Aluno adicionado com sucesso!");
  }

  public void incluirNoFim(Aluno aluno) {
    alunos.add(aluno);
    System.out.println(alunos);
    System.out.println("Aluno cadastrado com sucesso!");
  }

  public void ordenar() {
    alunos.sort(Comparator.comparing(Aluno::getNome));
    System.out.println(alunos);
    System.out.println("Alunos ordenados com sucesso!");
  }
  
  public Aluno removerDoFim() {}

  public int tamanho() {}

  public Aluno get(int index) {}

}

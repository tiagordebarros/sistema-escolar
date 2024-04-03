import java.time.LocalDate;
import java.util.Arrays;

public class ListaDeAlunos {
  public static void main(String[] args) {
    Aluno[] alunos = {
      new Aluno("John Doe", "123.456.789-00","Rua Sem Nome",LocalDate.of(1990,11,12)), 
      new Aluno("Joana Doe","321.654.987-11","Rua Sem Número",LocalDate.of(2000,06,10))
    };

    System.out.println(Arrays.toString(alunos));
  }
}

import java.time.LocalDate;

public class Aluno {
  String nome;
  String cpf;
  String endereco;
  LocalDate dataDeNascimento;

  public Aluno(String nome, String cpf, String endereco, LocalDate dataDeNascimento) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.dataDeNascimento = dataDeNascimento;
  }

  @Override
  public String toString(){
    return "{" +
    "nome='" + nome + '\'' +
    ", cpf='" + cpf + '\'' +
    ", endereco='" + endereco + '\'' +
    ", dataDeNascimento=" + dataDeNascimento +
    '}';
  }

}

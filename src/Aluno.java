import java.time.LocalDate;

public class Aluno {
  // Atributos
  private String nome;
  private String cpf;
  private String endereco;
  private LocalDate dataDeNascimento;

  // Método especial construtor
  public Aluno(String nome, String cpf, String endereco, LocalDate dataDeNascimento) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.dataDeNascimento = dataDeNascimento;
  }

  // Métodos getters
  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public LocalDate getDataDeNascimento() {
    return dataDeNascimento;
  }

  // Métodos setters
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void setDataDeNascimento(LocalDate dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }

  // Métodos em geral
  public int getIdade() {
    LocalDate dataAtual = LocalDate.now();
    return dataAtual.minusYears(dataDeNascimento.getYear()).getYear();
  }

  // Overrides
  @Override
  public String toString() {
    return "{" +
        "nome='" + nome + '\'' +
        ", cpf='" + cpf + '\'' +
        ", endereco='" + endereco + '\'' +
        ", dataDeNascimento=" + dataDeNascimento +
        '}';
  }

  @Override
  public boolean equals(Object outro) {
    if (this == outro) {
      return true;
    }
    if (outro == null || getClass() != outro.getClass()) {
      return false;
    }
    Aluno aluno = (Aluno) outro;
    return cpf.equals(aluno.cpf);
  }
}

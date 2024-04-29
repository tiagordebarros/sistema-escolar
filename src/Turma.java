import java.util.List;
import java.util.ArrayList;
class Turma {
  // Atributos
  int codigoDaTurma;
  String etapaDeEnsino;
  int ano;
  int limiteDeVagas;
  int numeroDeMatriculados;
  List<Aluno> alunosMatriculados;

  // Método especial construtor
  public Turma(int codigoDaTurma, String etapaDeEnsino, int ano, int limiteDeVagas, int numeroDeMatriculados) {
      this.codigoDaTurma = codigoDaTurma;
      this.etapaDeEnsino = etapaDeEnsino;
      this.ano = ano;
      this.limiteDeVagas = limiteDeVagas;
      this.numeroDeMatriculados = numeroDeMatriculados;
      this.alunosMatriculados = new ArrayList<>();
  }
  
  // Métodos getters
  public int getCodigoDaTurma() {
      return codigoDaTurma;
  }

  public String getEtapaDeEnsino() {
    return etapaDeEnsino;
  }

  public int getAno() {
    return ano;
  }

  public int getLimiteDeVagas() {
    return limiteDeVagas;
  }

  public int getNumeroDeMatriculados() {
    return numeroDeMatriculados;
  }

  public List<Aluno> getAlunosMatriculados() {
      return alunosMatriculados;
  }

  // Métodos setters
  public void setCodigoDaTurma(int codigoDaTurma) {
    this.codigoDaTurma = codigoDaTurma;
  }

  public void setEtapaDeEnsino(String etapaDeEnsino) {
    this.etapaDeEnsino = etapaDeEnsino;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public void setLimiteDeVagas(int limiteDeVagas) {
    this.limiteDeVagas = limiteDeVagas;
  }

  public void setNumeroDeMatriculados(int numeroDeMatriculados) {
    this.numeroDeMatriculados = numeroDeMatriculados;
  }

  public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
    this.alunosMatriculados = alunosMatriculados;
  }

  // Overrides
  @Override
  public String toString() {
      return "{" +
              "codigoDaTurma='" + codigoDaTurma + '\'' +
              ", etapaDeEnsino='" + etapaDeEnsino + '\'' +
              ", ano='" + ano + '\'' +
              ", limiteDeVagas='" + limiteDeVagas + '\'' +
              ", numeroDeMatriculados=" + numeroDeMatriculados +
              '}';
  }
}

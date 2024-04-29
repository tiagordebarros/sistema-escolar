import java.util.List;
import java.util.ArrayList;
class Turma {
  int codigoDaTurma;
  String etapaDeEnsino;
  int ano;
  int limiteDeVagas;
  int numeroDeMatriculados;
  List<Aluno> alunosMatriculados;

  public Turma(int codigoDaTurma, String etapaDeEnsino, int ano, int limiteDeVagas, int numeroDeMatriculados) {
      this.codigoDaTurma = codigoDaTurma;
      this.etapaDeEnsino = etapaDeEnsino;
      this.ano = ano;
      this.limiteDeVagas = limiteDeVagas;
      this.numeroDeMatriculados = numeroDeMatriculados;
      this.alunosMatriculados = new ArrayList<>();
  }

  public int getCodigoDaTurma() {
      return codigoDaTurma;
  }

  public String getEtapaDeEnsino() {
    return etapaDeEnsino;
}

  public List<Aluno> getAlunosMatriculados() {
      return alunosMatriculados;
  }

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

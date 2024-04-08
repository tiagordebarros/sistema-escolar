import java.util.List;
// import java.util.ArrayList;
public class Turma {
  int codigoDaTurma;
  String etapaDeEnsino;
  int ano;
  int limiteDeVagas;
  int numeroDeMatriculados;
  List<Aluno> alunosMatriculados;
  // List<Turma> listaDeTurmas;

  public Turma(int codigoDaTurma, String etapaDeEnsino, int ano, int limiteDeVagas, int numeroDeMatriculados) {
    this.codigoDaTurma = codigoDaTurma;
    this.etapaDeEnsino = etapaDeEnsino;
    this.ano = ano;
    this.limiteDeVagas = limiteDeVagas;
    this.numeroDeMatriculados = numeroDeMatriculados;
  }

  public int getCodigoDaTurma() {
    return codigoDaTurma;
  }

  // public void ListaDeTurmas() {
  //   this.listaDeTurmas = new ArrayList<>();
  // }

  // public void cadastrarTurma(Turma turma) {
  //   listaDeTurmas.add(turma);
  //   System.out.println(listaDeTurmas);
  //   System.out.println("Turma cadastrada com sucesso!");
  // }

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

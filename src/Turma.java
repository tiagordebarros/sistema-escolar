import java.util.List;

public class Turma {
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
  }
}

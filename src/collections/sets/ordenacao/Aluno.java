package collections.sets.ordenacao;

import java.util.Comparator;

class Aluno implements Comparable<Aluno> {
  private String nome;
  private long matricula;
  private double nota;

  Aluno(String nome, long matricula, double nota) {
    this.nome = nome;
    this.matricula = matricula;
    this.nota = nota;
  }

  public Long getMatricula() { return this.matricula; }
  public String getNome() { return this.nome; }
  public double getNota() { return this.nota; }

  @Override
  public int compareTo(Aluno al) {
    return nome.compareToIgnoreCase(al.nome);
  }
}

class ComparatorPorNota implements Comparator<Aluno> {
  @Override
  public int compare(Aluno al1, Aluno al2) {
    return Double.compare(al1.getNota(), al2.getNota());
  }
}

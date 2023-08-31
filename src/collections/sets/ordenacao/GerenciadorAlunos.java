package collections.sets.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class GerenciadorAlunos {
  Set<Aluno> alunos;

  GerenciadorAlunos() {
    this.alunos = new HashSet<>();
  }

  void adicionarAluno(String nome, long matricula, double nota) {
    Aluno novoAluno = new Aluno(nome, matricula, nota);

    this.alunos.add(novoAluno);
  }

  void removerAluno(long matricula) {
    if(!this.alunos.isEmpty()) {
      for(Aluno al : this.alunos) {
        if(al.getMatricula().equals(matricula)) {
          this.alunos.remove(al);
        }
      }
    }
  }
  void exibirAlunosPorNome() {
    Set<Aluno> alunosPorNome = new TreeSet<>(this.alunos);
    alunosPorNome.addAll(this.alunos);
    for(Aluno al : alunosPorNome) {
      System.out.println("{" + al.getMatricula() + '-' + al.getNome() + " | Nota: " + al.getNota() + "}");
    }
  }

  void exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
    alunosPorNota.addAll(this.alunos);
    for(Aluno al : alunosPorNota) {
      System.out.println("{" + al.getMatricula() + '-' + al.getNome() + " | Nota: " + al.getNota() + "}");
    }
  }

  void exibirAlunos() {
    for(Aluno al : this.alunos) {
      System.out.println("{" + al.getMatricula() + '-' + al.getNome() + " | Nota: " + al.getNota() + "}");
    }
  }

  public static void main(String[] args) {
    GerenciadorAlunos ga = new GerenciadorAlunos();

    ga.adicionarAluno("Willian", 1331221, 8.8);
    ga.adicionarAluno("Wallace", 1331777, 9.0);
    ga.adicionarAluno("Djair", 1656522, 8.9);
    
    ga.exibirAlunosPorNota();
  }
}

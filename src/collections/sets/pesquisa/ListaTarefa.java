package collections.sets.pesquisa;

import java.util.HashSet;
import java.util.Set;

class ListaTarefa {
  Set<Tarefa> tarefas;

  ListaTarefa() {
    this.tarefas = new HashSet<>();
  }

  void adicionarTarefa(String tarefa) {
    Tarefa novaTarefa = new Tarefa(tarefa, false);
    this.tarefas.add(novaTarefa);
  }

  void removerTarefa(String descricaoTarefa) {
    if(!this.tarefas.isEmpty()) {
      for(Tarefa t : this.tarefas) {
        if(t.getDescricao().equals(descricaoTarefa)) {
          this.tarefas.remove(t);
          break;
        }
      }
    }
  }

  void exibirTarefas() {
    for(Tarefa t : this.tarefas) {
      System.out.println("{" + t.getDescricao() + ", Concluida: " + t.getConcluida() + "}");
    }
  }

  int contarTarefas() {
    return this.tarefas.size();
  }

  Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    for(Tarefa t : this.tarefas) {
      if(t.getConcluida()) {
        tarefasConcluidas.add(t);
      }
    }
    return tarefasConcluidas;
  }

  Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasPendentes = new HashSet<>();
    for(Tarefa t : this.tarefas) {
      if(!t.getConcluida()) {
        tarefasPendentes.add(t);
      }
    }
    return tarefasPendentes;
  }

  void marcarTarefaConcluida(String descricao) {
    for(Tarefa t : this.tarefas) {
      if(t.getDescricao().equals(descricao)) {
        t.setConcluida(true);
      }
    }
  }

  void marcarTarefaPendente(String descricao) {
    for(Tarefa t : this.tarefas) {
      if(t.getDescricao().equals(descricao)) {
        t.setConcluida(false);
      }
    }
  }

  void limparListaTarefas() {
    this.tarefas.clear();
  }

  public static void main(String[] args) {
    ListaTarefa lt = new ListaTarefa();
    
    lt.adicionarTarefa("Banhar os dogs");
    lt.adicionarTarefa("Meter o shape");
    lt.adicionarTarefa("Mover muamba");
    lt.marcarTarefaConcluida("Mover muamba");
    lt.removerTarefa("Meter o shape");
    Set<Tarefa> tp = lt.obterTarefasPendentes();
    Set<Tarefa> tc = lt.obterTarefasConcluidas();
    for(Tarefa t : tp) {
      System.out.println("pendente: " + t.getDescricao());
    }
    for(Tarefa t : tc) {
      System.out.println("Concluida: " + t.getDescricao());
    }
    
  }

}

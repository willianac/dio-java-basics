package java_functional.desafios;

import java_functional.Numeros;

class VerificarTodosSaoDistintos {
  Numeros n = new Numeros();

  boolean fnVerificarTodosSaoDistintos() {
    return n.numeros.stream()
      .distinct()
      .count() == n.numeros.size();
  }

  public static void main(String[] args) {
    VerificarTodosSaoDistintos vtsd = new VerificarTodosSaoDistintos();
    boolean result = vtsd.fnVerificarTodosSaoDistintos();
    System.out.println(result);
  }
}

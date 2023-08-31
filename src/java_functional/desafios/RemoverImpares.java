package java_functional.desafios;

import java_functional.Numeros;

class RemoverImpares {
  Numeros n = new Numeros();

  void fnRemoverImpares() {
    n.numeros.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.println(n));
  }

  public static void main(String[] args) {
    RemoverImpares ri = new RemoverImpares();

    ri.fnRemoverImpares();
  }
}

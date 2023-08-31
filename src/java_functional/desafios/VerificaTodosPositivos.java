package java_functional.desafios;

import java_functional.Numeros;

class VerificaTodosPositivos {
  Numeros n = new Numeros();

  boolean fnVerificaTodosPositivos() {
    return n.numeros.stream().allMatch(n -> n > 0);
  }

  public static void main(String[] args) {
    VerificaTodosPositivos vtp = new VerificaTodosPositivos();

    boolean result = vtp.fnVerificaTodosPositivos();
    System.out.println(result);
  }
}

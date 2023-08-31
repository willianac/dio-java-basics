package java_functional.desafios;

import java_functional.Numeros;

class VerificarMaiorQue10 {
  Numeros n = new Numeros();
  
  boolean fnVerificarMaiorQue10() {
    return n.numeros.stream().anyMatch(n -> n > 10);
  }

  public static void main(String[] args) {
    VerificarMaiorQue10 vmq10 = new VerificarMaiorQue10();

    boolean result = vmq10.fnVerificarMaiorQue10();
    System.out.println(result);
  }
}

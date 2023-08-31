package java_functional.desafios;

import java_functional.Numeros;

class SomaDosQuadrados {
  Numeros n = new Numeros();
  
  int fnSomaDosQuadrados() {
    return n.numeros.stream()
      .map(n -> n * n)
      .reduce(0, (n1, n2) -> n1 + n2);
  }

  public static void main(String[] args) {
    SomaDosQuadrados sdq = new SomaDosQuadrados();

    int r = sdq.fnSomaDosQuadrados();
    System.out.println(r);
  }
}

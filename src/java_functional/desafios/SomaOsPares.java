package java_functional.desafios;

import java_functional.Numeros;

class SomaOsPares {
  Numeros n = new Numeros();

  void fnSomaOsPares() {
    int soma = n.numeros.stream()
      .filter(n -> n % 2 == 0)
      .reduce(0, (n1, n2) -> n1 + n2);
    System.out.println(soma);
  }
  
  public static void main(String[] args) {
    SomaOsPares sp = new SomaOsPares();
    sp.fnSomaOsPares();
  }
}

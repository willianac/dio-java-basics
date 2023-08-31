package java_functional.desafios;

import java_functional.Numeros;

class OrdemCrescente {
  Numeros n = new Numeros();

  void numerosPorOrdemCrescente() {
    n.numeros.stream().sorted().forEach(n -> System.out.println(n));
  }

  static void main(String[] args) {
    OrdemCrescente oc = new OrdemCrescente();
    oc.numerosPorOrdemCrescente();
  }
}

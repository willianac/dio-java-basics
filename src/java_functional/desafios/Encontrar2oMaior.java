package java_functional.desafios;

import java.util.List;
import java.util.stream.Collectors;

import java_functional.Numeros;

class Encontrar2oMaior {
  Numeros n = new Numeros();
  
  void fnEncontrar2oMaior() {
    List<Integer> arrayOrdenado = n.numeros.stream()
      .sorted()
      .distinct()
      .collect(Collectors.toList());
    System.out.println("Numero mais alto é: " + arrayOrdenado.get(arrayOrdenado.size() - 2));
  }

  public static void main(String[] args) {
    Encontrar2oMaior e2m = new Encontrar2oMaior();
    e2m.fnEncontrar2oMaior();
  }
}

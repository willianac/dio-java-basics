package java_functional.desafios;

import java.util.List;
import java.util.stream.Collectors;

import java_functional.Numeros;

class CalcularMedia {
  Numeros n = new Numeros();

  int fnCalcularMedia() {
    List<Integer> numerosMaioresQueCinco = n.numeros.stream()
      .filter(n -> n > 5)
      .collect(Collectors.toList());
    return numerosMaioresQueCinco.stream()
      .reduce(0, (n1, n2) -> n1 + n2) / numerosMaioresQueCinco.size();
  }

  public static void main(String[] args) {
    CalcularMedia cm = new CalcularMedia();
    int result = cm.fnCalcularMedia();
    System.out.println(result);
  }
}

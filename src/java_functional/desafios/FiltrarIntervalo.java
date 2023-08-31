package java_functional.desafios;

import java.util.List;
import java.util.stream.Collectors;

import java_functional.Numeros;

class FiltrarIntervalo {
    Numeros n = new Numeros();

    List<Integer> fnFiltrarIntervalo() {
      return n.numeros.stream()
        .filter(n -> n > 2 && n < 7)
        .collect(Collectors.toList());
    }

    public static void main(String[] args) {
      FiltrarIntervalo fi = new FiltrarIntervalo();
      List<Integer> r = fi.fnFiltrarIntervalo();
      System.out.println(r);
    }
}

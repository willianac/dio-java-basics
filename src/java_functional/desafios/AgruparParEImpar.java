package java_functional.desafios;

import java.util.ArrayList;
import java.util.List;

import java_functional.Numeros;

class AgruparParEImpar {
  Numeros n = new Numeros();
  
  void fnAgruparParEImpar() {
    List<Integer> pares = new ArrayList<>();
    List<Integer> impares = new ArrayList<>();

    n.numeros.stream()
      .forEach(n -> {
        if(n % 2 == 0) {
          pares.add(n);
        } else {
          impares.add(n);
        }
      });
    System.out.println("Os pares são: " + pares);
    System.out.println("Os impares são: " + impares);
  }

  public static void main(String[] args) {
    AgruparParEImpar api = new AgruparParEImpar();

    api.fnAgruparParEImpar();
  }
}

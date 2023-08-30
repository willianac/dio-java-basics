package collections.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  List<Integer> listaDeNumeros;

  public OrdenacaoNumeros() {
    this.listaDeNumeros = new ArrayList<>();
  }

  void adicionarNumero(int n) {
    this.listaDeNumeros.add(n);
  }

  List<Integer> ordenarAscendente() {
    List<Integer> listaOrdenadaAsc = new ArrayList<>(this.listaDeNumeros);
    Collections.sort(listaOrdenadaAsc);
    return listaOrdenadaAsc;
  }

  List<Integer> ordenarDescendente() {
    List<Integer> listaOrdenadaDesc = new ArrayList<>(this.listaDeNumeros);
    Collections.sort(listaOrdenadaDesc);
    Collections.reverse(listaOrdenadaDesc);
    return listaOrdenadaDesc; 
  }

  public static void main(String[] args) {
    OrdenacaoNumeros on = new OrdenacaoNumeros();
    on.adicionarNumero(13);
    on.adicionarNumero(5);
    on.adicionarNumero(1);
    on.adicionarNumero(32);
    List<Integer> listaOrdenada = on.ordenarAscendente();
    List<Integer> listaDesc = on.ordenarDescendente();
    System.out.println(listaDesc);
  }
}

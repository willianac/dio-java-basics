package collections.maps.ordenacao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
  Map<String, Livro> livraria;

  LivrariaOnline() {
    this.livraria = new HashMap<>();
  }

  void adicionarLivro(String link, String titulo, String autor, double preco) {
    this.livraria.put(link, new Livro(titulo, autor, preco));
  }

  void removerLivro(String titulo) {
    this.livraria.remove(titulo);
  }

  void exibirLivrosOrdenadosPorPreco() {
    Map<String, Livro> livrosPorPreco = new TreeMap<>(livraria);
    System.out.println(livrosPorPreco + "\n");
  }



  public static void main(String[] args) {
    LivrariaOnline lo = new LivrariaOnline();
    lo.adicionarLivro("http://localamazon:3000/livro1", "o grande capitulo", "joaquim", 169.90);
    lo.adicionarLivro("http://localamazon:3000/livrao2", "o grande capitulo 2", "joao", 10.90);
    lo.adicionarLivro("http://localamazon:3000/livraaaço3", "o grande capitulo 3", "jorge", 39.90);
    lo.exibirLivrosOrdenadosPorPreco();
  }
}

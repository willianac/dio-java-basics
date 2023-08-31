package collections.maps.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  Map<String, Integer> contagem;

  ContagemPalavras() {
    this.contagem = new HashMap<String, Integer>();
  }

  void adicionarPalavra(String palavra, Integer contagem) {
    this.contagem.put(palavra, contagem);
  }

  void removerPalavra(String palavra) {
    this.contagem.remove(palavra);
  }

  void exibirContagemPalavras() {
    System.out.println(this.contagem.size());
  }

  void encontrarPalavraMaisFrequente() {
    String palavraMaisFrequente = null;
    int maiorContagem = 0;

    for(Map.Entry<String, Integer> entry : this.contagem.entrySet()) {
      if (entry.getValue() > maiorContagem) {
        maiorContagem = entry.getValue();
        palavraMaisFrequente = entry.getKey();
      }
    }
    System.out.println(palavraMaisFrequente);
  }

  public static void main(String[] args) {
    ContagemPalavras cp = new ContagemPalavras();

    cp.adicionarPalavra("price", 3);
    cp.adicionarPalavra("soap", 1);
    cp.adicionarPalavra("ghost", 4);

    cp.encontrarPalavraMaisFrequente();
  }
}

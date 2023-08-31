package collections.maps.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

class Dicionario {
  Map<String, String> dicionario;

  Dicionario() {
    this.dicionario = new HashMap<String,String>();
  }

  void adicionarPalavra(String palavra, String definicao) {
    this.dicionario.put(palavra, definicao);
  }

  void removerPalavra(String palavra) {
    this.dicionario.remove(palavra);
  }

  void exibirPalavras() {
    System.out.println(this.dicionario);
  }

  String pesquisarPorPalavra(String palavra) {
    String definicao = this.dicionario.get(palavra);
    return definicao;
  }

  public static void main(String[] args) {
    Dicionario dc = new Dicionario();

    dc.adicionarPalavra("Trap", "Estilo de música atualmente popular onde putaria e ostentação é o mais importante");
    dc.adicionarPalavra("Vegas", "Cidade norte-americana popular por seus desertos e seus cassinos muito luxuosos");
    String verify = dc.pesquisarPorPalavra("Vegas");
    System.out.println(verify);
  }
}

package collections.sets.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  Set<String> setDePalavras;

  ConjuntoPalavrasUnicas() {
    this.setDePalavras = new HashSet<>();
  }

  void adicionarPalavra(String palavra) {
    this.setDePalavras.add(palavra);
  }

  void removerPalavra(String palavra) {
    this.setDePalavras.remove(palavra);
  }

  boolean verificarPalavra(String palavra) {
    return this.setDePalavras.contains(palavra);
  }

  Set<String> exibirPalavrasUnicas() {
    return this.setDePalavras;
  }

  public static void main(String[] args) {
    ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();
    
    cpu.adicionarPalavra("Jorge");
    cpu.adicionarPalavra("Mauro");
    // HashSet não permite duplicatas, a próxima linha não é adicionada
    cpu.adicionarPalavra("Jorge");
    cpu.adicionarPalavra("Sofia");
    cpu.removerPalavra("Jorge");

    boolean personExists = cpu.verificarPalavra("Joao");
    System.out.println(personExists);
  }
}

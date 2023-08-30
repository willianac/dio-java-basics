package collections.lists.operacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  List<Item> carrinho;

  public CarrinhoDeCompras() {
    this.carrinho = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preço, int quantidade) {
    Item novoItem = new Item(nome, preço, quantidade);
    this.carrinho.add(novoItem);
  }

  public void removerItem(String nome) {
    ArrayList<Item> itensParaRemover = new ArrayList<>();
    for(Item item : this.carrinho) {
      if(item.nome.equalsIgnoreCase(nome)) {
        itensParaRemover.add(item);
      }
    }
    this.carrinho.removeAll(itensParaRemover);
  }

  public void exibirItens() {
    for(Item item : this.carrinho) {
      System.out.println(item);
    }
  }

  public double calcularValorTotal() {
    double valorTotal = 0;

    for(Item item : this.carrinho) {
      double valorDoItem = item.preço * item.quantidade;
      valorTotal += valorDoItem;
    }
    return valorTotal;
  }

  public static void main(String[] args) {
    CarrinhoDeCompras novoCarrinho = new CarrinhoDeCompras();
    novoCarrinho.adicionarItem("RX 7600", 2500.50, 2);
    novoCarrinho.adicionarItem("RTX 4060", 3100.90, 1);
    novoCarrinho.adicionarItem("RX 7600", 2500.50, 2);

    novoCarrinho.removerItem("RX 7600");
    for(Item item : novoCarrinho.carrinho ) {
      System.out.println(item.nome + " " + item.preço + " " + item.quantidade);
    }
  }
}

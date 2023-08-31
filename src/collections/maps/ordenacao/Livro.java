package collections.maps.ordenacao;

class Livro implements Comparable<Livro> {
  private String titulo;
  private String autor;
  private double preco;

  Livro(String titulo, String autor, double preco) {
    this.titulo = titulo;
    this.autor = autor;
    this.preco = preco;
  }

  @Override
  public int compareTo(Livro liv1) {
    return Double.compare(this.preco, liv1.getPreco());
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public Double getPreco() {
    return preco;
  }

  @Override
  public String toString() {
    return "Livro{" +
        "titulo='" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", preco=" + preco +
        '}';
  }
}

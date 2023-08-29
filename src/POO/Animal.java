package POO;

abstract class Animal {
  protected void comer() {
    System.out.println("Comendo...");
  }
  protected void beber() {
    System.out.println("Bebendo...");
  }
  abstract void fazerBarulho();

}
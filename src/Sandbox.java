import exceptions.InvalidCPFException;

public class Sandbox {
  public static void main(String[] args) {
    try {
      String isCPFValid = checkCPF("1111111111");
      System.out.println("CPF is valid");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static String checkCPF(String cpf) throws InvalidCPFException {
    if(cpf.length() < 11) {
      throw new InvalidCPFException();
    }
    return "CPF valido";
  }
}

import java.util.Scanner;

class Senha {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite sua senha:");
   int SenhaCorreta = 7699;
     int Senha = entrada.nextInt();

    if (SenhaCorreta == Senha) {
    
      System.out.println("Sua senha esta correta.");
    }else {
      System.out.println("Sua senha esta errada.");
    }
  }
}
//Quarto projeto

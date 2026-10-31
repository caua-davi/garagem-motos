import java.util.Scanner;

class Futuro {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("qual o seu nome?");
  String nome = entrada.nextLine();
    System.out.println("qual a sua idade?");

 int idade = entrada.nextInt();

 entrada.nextLine();

  System.out.println("qual a sua meta?");
  String Meta = entrada.nextLine();
  System.out.println("seu nome é: " + nome);
  System.out.println("você tem: " + idade);
 System.out.println("Sua Meta é " + Meta);
  }
}
// segundo projeto

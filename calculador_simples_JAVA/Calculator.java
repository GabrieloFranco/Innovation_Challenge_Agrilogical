import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.println("DIGITE O PRIMEIRO NÚMERO:");
      double num1 = input.nextDouble();
  
      System.out.println("DIGITE O SEGUNDO NÚMERO:");
      double num2 = input.nextDouble();
  
      System.out.println("ESCOLHA UMA OPERAÇÃO (+, -, *, /):");
      char operator = input.next().charAt(0);
  
  
      double result;
      switch(operator) {
        case '+':
          result = num1 + num2;
          break;

        case '-':
          result = num1 - num2;
          break;

        case '*':
          result = num1 * num2;
          break;

        case '/':
          if (num2 == 0) {
            System.out.println("ERRO! IMPOSSÍVEL DIVIDIR POR ZERO");
            continue;
          }
          result = num1 / num2;
          break;

        default:
          System.out.println("ERRO!  OPERAÇÃO INVÁLIDA");
          continue;
      }

      System.out.println("Result: " + result);
    }
  }
}
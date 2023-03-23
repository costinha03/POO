package Aula03;

import java.util.Scanner;

public class somaPrimos {
  

  public static boolean ehPrimo(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;
    do {
      System.out.print("Digite um número inteiro positivo: ");
      num = sc.nextInt();
    } while (num <= 0);

    int soma = 0;
    for (int i = 2; i <= num; i++) {
      if (ehPrimo(i)) {
        soma += i;
      }
    }
sc.close();
    System.out.println("A soma dos números primos até " + num + " é " + soma);
  }
}

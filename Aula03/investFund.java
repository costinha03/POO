package Aula03;
import java.util.Scanner;

public class investFund {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double taxa;
		double mont_inv;
		
		do {	
			System.out.print("Montante investido (multiplos de 1000): ");
			mont_inv = sc.nextDouble();
		} while (mont_inv < 0 || mont_inv%1000 != 0);
		
		do {
			System.out.print("Taxa de juro mensal (entre 0% e 5%): ");
			taxa = sc.nextDouble();
		} while (taxa < 0 || taxa > 5);
		
		for (int i = 1; i <= 12; i++) {
			mont_inv += (taxa*0.01*mont_inv);
			System.out.printf("Ao fim do %dº mês, o seu montante atual é: %.2f euros. \n", i, mont_inv);
		}

        sc.close();
    }
}


package Aula02;
import java.util.Scanner;
public class speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira d1 (em Km): ");
        double d1 = sc.nextDouble();
        System.out.print("Insira v1 (em Km/h): ");
        double v1 = sc.nextDouble();
        System.out.print("Insira d2 (em Km): ");
        double d2 = sc.nextDouble();
        System.out.print("Insira v2 (em Km/h): ");
        double v2 = sc.nextDouble();
        if (v1 <= 0 || v2 <= 0 || d1 <= 0 || d2 <= 0 ){
            System.out.print("Insira valores válidos (positivos)");
        }
        else
        {double vMedia =  (d1 + d2) / ((d1 / v1) + (d2 / v2));
        System.out.println("A velocidade média da viagem entre A e B foi " + String.format("%.3f", vMedia) + " Km/h");
        }
        sc.close();
    }
}

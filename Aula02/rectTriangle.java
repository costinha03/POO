package Aula02;
import java.util.Scanner;
public class rectTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Insira a medida do lado A: ");
        a = sc.nextDouble();
        System.out.print("Insira a medida do lado B: ");
        b = sc.nextDouble();
        if (a > 0 && b > 0) {
            c = Math.sqrt(a * a + b * b);
            double angle = Math.toDegrees(Math.atan(b/a));
            System.out.println("A hipotenusa é " + String.format("%.2f", c) +  " e o ângulo entre A e a hipotenusa tem " + String.format("%.1f", angle) + " graus de amplitude");
        }
        else
        {System.out.println("Os valores dos catetos devem ser positivos.");}
        sc.close();
    }
        
    }


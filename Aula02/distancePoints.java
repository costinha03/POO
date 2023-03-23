package Aula02;
import java.util.Scanner;
public class distancePoints {
    public static void main(String[] args){
        double x1, x2, y1, y2, distance; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira x1: ");
        x1 = sc.nextDouble();
        System.out.print("Insira x2: ");
        x2 = sc.nextDouble();
        System.out.print("Insira y1: ");
        y1 = sc.nextDouble();
        System.out.print("Insira y2: ");
        y2 = sc.nextDouble();
        distance = Math.sqrt((Math.pow(x1-x2, 2) + (Math.pow(y1 - y2, 2))));
        System.out.print("A distância entre os dois pontos é " + String.format("%.3f", distance));
        sc.close();
    }
}

package Aula02;
import java.util.Scanner;
public class CelsiusToFar {
    public static void main(String[] args){
        double celsius, far;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a temperatura em ºC: ");
        celsius = sc.nextDouble();
        far = celsius * 1.8 + 32;
		System.out.println("A temperatura em ºF é " + far);
		sc.close();   
}
}
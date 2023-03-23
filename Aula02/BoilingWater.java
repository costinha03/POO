package Aula02;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a massa de água em Kg ");
        double weight = sc.nextDouble();  
        System.out.print("Insira a temperatura inicial da água ");
        double temp = sc.nextDouble();
        System.out.print("Insira a temperatura final da água ");
        double tempfin = sc.nextDouble();
        double tempVariation = tempfin - temp;
        double energy = weight * tempVariation * 4184;
        System.out.print("Para aumentar a temperatura de " + weight + "Kg  de água são necessários " + energy + "J" );

        sc.close();
    }
}

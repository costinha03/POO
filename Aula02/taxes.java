package Aula02;

import java.util.Scanner;
public class taxes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor investido ");
        double money = sc.nextDouble();
        System.out.print("Insira a taxa de juro mensal ");
        double tax = sc.nextDouble();
        double threeMonths = money * Math.pow(1+tax / 100, 3); 
        System.out.print("Ao fim de 3 meses, o valor é de " + String.format("%.3f",threeMonths )  + " euros");
        sc.close();
    }    
}

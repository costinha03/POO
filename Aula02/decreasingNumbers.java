package Aula02;
import java.util.Scanner;
public class decreasingNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor de N: ");
        int n = sc.nextInt();
        while(n >= 0){
            if (n % 10 != 0){
                System.out.print(n + ", ");
            }
            else{
                System.out.println(n);
            }
            n --;
        }
    sc.close();
    }
}

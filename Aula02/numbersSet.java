package Aula02;
import java.util.Scanner;
public class numbersSet {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma cadeia de números reais, acabando com o número inicial: ");
        double n1 = sc.nextDouble();
        double num;
        double max = n1;
        double min = n1;
        double total = n1;
        int count = 0;
    
        
        do {
            
            num = sc.nextDouble();
            
            {
             
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
                
               
            } 
            total += num;
            count++;
        } while (num != n1);
        
        double media = total / count;
        
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Média: " + String.format("%.2f", media));
        System.out.println("Total de números lidos: " + count);
        
        sc.close();
    }
}



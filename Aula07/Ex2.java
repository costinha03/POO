package Aula07;

import java.util.Scanner;



public class Ex2 {
    public static void main(String[] args){
       
        int opt;
        Date data1 = null;
        Date data2 = null; 
 
        Scanner sc= new Scanner(System.in);
        do{
                System.out.print("Operações com data\n1 - Criar nova data\n2 - Mostrar data atual\n3 - Incrementar data\n4 - Decrementar data\n0 - Encerrar programa\nOpção: ");
                opt = sc.nextInt();
                int day = 0, year = 0, month = 0, increment, decrement;
                switch(opt){
                    case 0:
                        System.out.println("A encerrar. Obrigado por usar!");
                        break;
                    case 1:
                        do {
                            System.out.print("Ano? ");
                            year = sc.nextInt();
                        } while (year <= 0);
                        do {
                            System.out.print("Mês? ");
                            month = sc.nextInt();
                        } while (DateYMD.ValidMonth(month));
                        do {
                            System.out.print("Dia? ");
                            day = sc.nextInt();
                        } while (day > DateYMD.GetDays(month, year));
                        data1 = new DateYMD(year, month, day);
                        data2 = new DateND(year, month, day);
                        System.out.println("Current date: " + data1);
                        System.out.println("Distance to 2000/1/1: " + data2);
                    case 2:
                        System.out.println("Data: "+ data1);
                        System.out.print("\n");
                        break;
                    case 3:
                        System.out.println("Enter the increment(in days): ");
                        increment = sc.nextInt();
                        data1.Increment(increment);
                        data2.Increment(increment);
                        System.out.println("Current date: " + data1);
                        System.out.println("Distance to 200/1/1: " + data2);
                        break;
                    case 4:
                    System.out.println("Enter the decrement(in days): ");
                    decrement = sc.nextInt();
                    data1.Decrement(decrement);
                    data2.Decrement(decrement);
                    System.out.println("Current date: " + data1);
                    System.out.println("Distance to 200/1/1: " + data2);
                        break;
                    default:
                        System.out.println("Escolha uma opção válida!\n");
                        break;
                
        }
        
           
    }while(opt != 0);
     sc.close();}}

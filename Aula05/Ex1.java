package Aula05;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
       
        int opt;
        dateGen data = null; 
        int dia;
        int mes;
        int ano;

        Scanner sc= new Scanner(System.in);
        do{
                System.out.print("Operações com data\n1 - Criar nova data\n2 - Mostrar data atual\n3 - Incrementar data\n4 - Decrementar data\n0 - Encerrar programa\nOpção: ");
                opt = sc.nextInt();
                switch(opt){
                    case 0:
                        System.out.println("A encerrar. Obrigado por usar!");
                        break;
                    case 1:
                        System.out.print("Insira um dia: ");
                        dia = sc.nextInt();
                        System.out.print("Insira um mês: ");
                        mes = sc.nextInt();
                        System.out.print("Insira um ano: ");
                        ano = sc.nextInt();  
                        try {
                            data = new dateGen(dia, mes, ano);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }        
                         
                        System.out.print("\n");
                        break;
                    case 2:
                        System.out.println("Data: "+ data);
                        System.out.print("\n");
                        break;
                    case 3:
                        data.nextDay();
                        break;
                    case 4:
                        data.dayBefore();
                        break;
                    default:
                        System.out.println("Escolha uma opção válida!\n");
                        break;
                }
        }while(opt != 0);
    sc.close();        
    }
}

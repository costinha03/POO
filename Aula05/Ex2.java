package Aula05;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int option;
      calendario data = null;
      int year, month, weekStart;
      do{
        System.out.println("\tOperations with calendars\n");
        System.out.println("1 - create new calendar");
        System.out.println("2 - print a month");
        System.out.println("3 - print full calendar");
        System.out.println("0 - exit\n");
        System.out.print("operation: ");
        option = sc.nextInt();
        switch(option){
            case 0: 
            System.out.println("Exiting. Thanks for using!");
            break;
            case 1: 
                    System.out.println("Insert a year: ");
                    year = sc.nextInt();
                    System.out.println("Insert the first day of the week");
                    System.out.printf("%9s | %9s | %9s | %9s | %9s | %9s | %9s \n","1=Sunday","2=Monday","3=Tuesday","4=Wednesday","5=Thursday","6=Friday","7=Saturday");
                    weekStart = sc.nextInt();
                    try {
                        data = new calendario(year, weekStart);
                    } catch (Exception e) {
                    System.out.println(e.getMessage());
            } 
            break;
            case 2:
                    System.out.print("Insert a month (0-12) ");
                    month = sc.nextInt();
                    if (dateGen.validMes(month)){
                        data.printMonth(month);
                    }else {System.out.println("Insert a month (0-12)");
                            }
                    break;
            case 3:
                data.printCalendario();
                    break;
            default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            

            }
        } while(option != 0);
      sc.close(); 
    }
    
    
}

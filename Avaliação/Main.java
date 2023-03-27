package Avaliação;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fighter[] figthers = new Fighter[10];
        Random random = new Random();
        int choice = 0;
        do {
            System.out.println("Game menu:");
            System.out.println("1. Generate fighters");
            System.out.println("2. Show all fighters");
            System.out.println("3. Start fight between selected fighters");
            System.out.println("4. Start fight between random fighters");
            System.out.println("5. Exit");

            choice = scanner.nextInt();




            switch (choice) {
                case 1:
                for (int i = 0; i < figthers.length; i++) {
                    figthers.add(new Fighter (Random.toString,);
                }
                    break;
                case 2:
                    for (Fighter fighters : figthers){
                        System.out.Print(fighters);
                    }
                    break;
                case 3:
                    
                    break;
                case 4:
                int f1 = random.nextInt(10) + 1;
                int f2 = random.nextInt(10) + 1;
                figthers[f1].attack(figthers[f2]);

                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Opção não existe!");
                    break;
            }

        } while (choice != 5);

        scanner.close();
    }
}

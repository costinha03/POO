package Aula09;

import java.util.ArrayList;
import java.util.Scanner;

public class PlaneTester {
    public static void main(String[] args) {
        ArrayList<Plane> fleet = new ArrayList<>();
        fleet.add(new MilitaryPlane("F16", "VBNJBYHV234", "Audi", 2021, 320, 2, 25));
        fleet.add(new MilitaryPlane("F12", "BHWVCDHV123", "Audi", 2023, 400, 1, 37));
        fleet.add(new ComercialPlane("A330", "GHBHBHYB178", "BMW", 2018, 200, 85, 12));
        fleet.add(new ComercialPlane("A450", "NDVKJSVB560", "BMW", 2023, 300, 120, 20));

        Scanner sc = new Scanner(System.in);
        int choice;
        String type, model, ID, manufacturer;
        int maxSpeed, crewNum, ammunition, prodYear, capacity;

        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Add a plane to the fleet");
            System.out.println("2. Remove a plane from the fleet");
            System.out.println("3. Search for a plane");
            System.out.println("4. Print summary of all planes in the fleet");
            System.out.println("5. Print list of all commercial planes in the fleet");
            System.out.println("6. Print list of all military planes in the fleet");
            System.out.println("7. Print the fastest plane in the fleet");
            System.out.println("0. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("Introduza o fabricante do avião: ");
                    manufacturer = sc.next();
                    System.out.print("Introduza o ano de produção: ");
                    prodYear = sc.nextInt();
                    System.out.print("Introduza o modelo do avião: ");
                    model = sc.next();
                    System.out.print("Introduza a capacidade máxima do avião: ");
                    capacity = sc.nextInt();
                    System.out.print("Introduza o ID do avião: ");
                    ID = sc.next();
                    System.out.print("Introduza a velocidade máxima do avião: ");
                    maxSpeed = sc.nextInt();
                    System.out.print("Escolha o tipo de avião a adicionar(M para militar ou C para comercial)");
                    type = sc.next().toUpperCase();
                    if (type == "M") {
                        System.out.print("Introduza o número de munições do avião");
                        ammunition = sc.nextInt();
                        Plane plane = new MilitaryPlane(model, ID, manufacturer, prodYear, maxSpeed, capacity,
                                ammunition);
                        PlaneManager.addPlane(plane, fleet, ID);
                    } else if (type == "C") {
                        System.out.print("Introduza o número de elementos da tripulação do avião");
                        crewNum = sc.nextInt();
                        Plane plane = new ComercialPlane(model, ID, manufacturer, prodYear, maxSpeed, capacity,
                                crewNum);
                        PlaneManager.addPlane(plane, fleet, ID);
                    }

                    break;
                case 2:
                    System.out.print("Insira o ID do avião a remover: ");
                    ID = sc.next();
                    PlaneManager.removePlane(ID, fleet);
                    break;
                case 3:
                    System.out.print("Insira o ID do avião a pesquisar: ");
                    ID = sc.next();
                    PlaneManager.searchPlane(ID, fleet);
                    break;
                case 4:
                    PlaneManager.printAllPlanes(fleet);
                case 5:
                    PlaneManager.printCommercialPlanes(fleet);
                    break;
                case 6:
                    PlaneManager.printMilitaryPlanes(fleet);
                    break;
                case 7:
                    PlaneManager.printFastestPlane(fleet);
                    break;
                case 0:
                    System.out.println("A encerrar o programa....");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }

}

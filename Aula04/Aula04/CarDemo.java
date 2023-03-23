package Aula04;
import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        kms += distance;
    }

}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        int count = 0;
        while (true) {
            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String[] parts = line.split(" ");
            String make = parts[0];
            int year = Integer.parseInt(parts[ parts.length - 2 ]);
            int kms = Integer.parseInt(parts[parts.length - 1]);
            String model = "";
            for (int i = 1; i < parts.length - 2; i++) {
                model += parts[i] + " ";
            }
            if (!validarMarca(make) ||  !validarAno(year) || validarQuilometragem(kms)) {
                System.out.println("Dados mal formatados. Tente novamente");
            } 
            Car car = new Car(make, model, year, kms);
            cars[count] = car;
            count++; 
            if (count == cars.length) {
                break;
            }
            
   } return count;
}
static void registerTrips(Car[] cars, int numCars) {
    while (true) {
        System.out.print("Registe uma viagem no formato \"carro:distância\" ou deixe em branco para terminar: ");
        String line = sc.nextLine();
        if (line.isEmpty()) {
            break;
        }
        String[] parts = line.split(":");
        if (parts.length != 2) {
            System.out.println("Dados mal formatados. Tente novamente");
     
        }
        String make = parts[0];
        int distance = Integer.parseInt(parts[1]);
        Car car = null;
        for (int i = 0; i < numCars; i++) {
            if (cars[i].make.equals(make)) {
                car = cars[i];
                break;
            }
        }
        if (car == null) {
            System.out.println("Carro não encontrado. Tente novamente");
       
        }
        car.drive(distance);
    } 
    System.out.print("Registe uma viagem no formato \"carro:distância\": ");
}
   
    public static boolean validarMarca(String marca) {
        return marca.matches("\\w+");
    }
    
    public static boolean validarModelo(String modelo) {
        return modelo.matches("\\w+");
    }
    
    public static boolean validarAno(int ano) {
        return ano > 0 ;
    }
    
    public static boolean validarQuilometragem(int quilometragem) {
        return quilometragem > 0;
    }
    public String toString(Car[] cars){
        String result = " ";
        for (int i = 0; i < cars.length; i++){
            result += cars[i].make + " " + cars[i].model + ", " + cars[i].year + ", kms:" + cars[i].kms + "\n";
        }
        return result;
    }
    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados: ");
        for (int i = 0; i < cars.length; i++){
            if (cars[i] != null)
            {System.out.print(cars[i].make + " " + cars[i].model + ", " + cars[i].year + ", kms:" + cars[i].kms + "\n");}
        }
        
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);


        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }
}

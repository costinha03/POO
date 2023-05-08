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
    public String toString(){
        return make + " " + model + " " + year + " " + kms;
    }
}

public class SimpleCarDemo {

    static Scanner sc = new Scanner(System.in);

    static  void listCars(Car[] cars) {
        System.out.println("Carros registados:");
        for (int i=0; i < cars.length; i++){
            System.out.print(cars[i].make + " " + cars[i].model + ", " + cars[i].year + ", kms:" + cars[i].kms + "\n");
        }
        System.out.print("\n");

    }

    public static void main(String[] args) {
        Car[] cars = {
            new Car("Renault", "Megane Sport Tourer", 2015, 35356),
            new Car("Toyota", "Camry", 2010, 32456),
            new Car("Mercedes", "Vito", 2008, 273891)
        };

        listCars(cars);

        // Adicionar 10 viagens geradas aleatoriamente
        for (int i=0; i<10; i++) {
            int j = (int)Math.round(Math.random()*2); // escolhe um dos 3 carros    
            int kms = (int)Math.round(Math.random()*1000); // viagem até 1000 kms
            cars[j].drive(kms);
            System.out.printf("Carro %d viajou %d quilómetros.\n", j, kms);

        }
        System.out.print("\n");

        listCars(cars); 

        sc.close();

    }
}
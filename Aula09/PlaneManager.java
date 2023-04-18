package Aula09;

import java.util.ArrayList;

import java.util.Iterator;

public class PlaneManager {

    public static void addPlane(Plane plane, ArrayList<Plane> fleet, String ID) {
        fleet.add(plane);
        Iterator<Plane> iter = fleet.iterator();
        while (iter.hasNext()) {
            if (iter.next().getID() == ID) {
                System.out.println("ID já usado. Deve usar um diferente");
                break;
            }
            if (!iter.hasNext() || iter.next().getID() != ID) {
                fleet.add(plane);
            }
        }
    }

    public static void removePlane(String ID, ArrayList<Plane> fleet) {

        Iterator<Plane> iter = fleet.iterator();
        while (iter.hasNext()) {
            if (iter.next().getID() == ID) {
                fleet.remove(iter.next());
                System.out.println("Avião removido com sucesso!");
                break;
            }
            if (!iter.hasNext() || iter.next().getID() != ID) {
                System.out.println("Avião não encontrado");
            }
        }
    }

    public static void searchPlane(String ID, ArrayList<Plane> fleet) {
        Iterator<Plane> iter = fleet.iterator();
        while (iter.hasNext()) {
            if (iter.next().getID() == ID) {
                System.out.println(iter.next());
                break;
            }
            if (!iter.hasNext() || iter.next().getID() != ID) {
                System.out.println("Avião não encontrado");
            }
        }
    }

    public static void printAllPlanes(ArrayList<Plane> fleet) {
        for (Plane plane : fleet) {
            System.out.println(plane);
        }
    }

    public static void printCommercialPlanes(ArrayList<Plane> fleet) {
        Iterator<Plane> iter = fleet.iterator();
        while (iter.hasNext()) {
            if (iter.next().getPlaneType() == "Comercial") {
                System.out.println(iter.next());
            }
        }
    }

    public static void printMilitaryPlanes(ArrayList<Plane> fleet) {
        Iterator<Plane> iter = fleet.iterator();
        while (iter.hasNext()) {
            if (iter.next().getPlaneType() == "Militar") {
                System.out.println(iter.next());
            }
        }
    }

    public static void printFastestPlane(ArrayList<Plane> fleet) {
        int maxSpeed = 0;
        Plane result = null;
        Iterator<Plane> iter = fleet.iterator();
        while (iter.hasNext()) {
            if (iter.next().getMaxSpeed() > maxSpeed) {
                result = iter.next();
            }
        }
        System.out.println(result);
    }
}

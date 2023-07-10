package Aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class flightManager {
    public static void main(String[] args) throws IOException {

        Set<Voo> flightLst = new HashSet<>();
        HashMap<String, String> companies = new HashMap<>();
        HashMap<String, Integer> departures = new HashMap<>();
        LocalTime depHour;
        String flight;
        String company;
        String departure;

        String obs;

        try (Scanner input1 = new Scanner(new File("voos.txt"), "UTF-8")) {
            String header = input1.nextLine();
            String header1 = input1.nextLine();
            while (input1.hasNext()) {
                String line = input1.nextLine();
                String[] fields = line.split("\\;");
                try {
                    double TaxId = Double.parseDouble(fields[0]);
                } catch (NumberFormatException e) {
                    System.out.println("Formaato de TaxId inválido!");
                    continue;
                }
                flight = fields[1];
                System.out.println(flight.substring(0, 2));
                company = searchCompany(flight.substring(0, 2), companies);
                departure = fields[2];
                addDep(departure, departures);

                try {
                    LocalDate startDate = LocalDate.parse(fields[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Formato de data inválido");
                    continue;
                    obs = "Previsto: " + depHour.plusHours(delay.getHour()).plusMinutes(delay.getMinute());

                }

                Voo v = new Voo(depHour, flight, company, departure, delay, obs);
                System.out.println(v);
                flightLst.add(v);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não existente!");
        }
        Scanner input2 = new Scanner(new File("companhias.txt"), "UTF-8");

        while (input2.hasNext()) {
            String line = input2.nextLine();
            String lines = input2.nextLine();
            String[] data = lines.split("\t");
            if (data.length != 2) {
                System.out.println("Invalid line format: ");
                continue;
            }
            companies.put(data[0], data[1]);
        }

        input2.close();
        printAll(flightLst);

    }

    private static String searchCompany(String searchTerm, HashMap<String, String> companies) {
        if (companies.containsKey(searchTerm)) {
            String companyName = companies.get(searchTerm);
            System.out.println("Company found: Code: " + searchTerm + ", Company Name: " + companyName);
            return companyName;
        } else {
            System.out.println("Company not found for code: " + searchTerm);
            return null;
        }
    }

    private static void addDep(String city, HashMap<String, Integer> departures) {
        if (!departures.containsKey(city)) {
            departures.put(city, 1);
        } else {
            departures.put(city, departures.get(city) + 1);
        }

    }

    private static void printAll(Set<Voo> lst) {
        List<Voo> sortedFlights = new ArrayList<>(lst);
        Collections.sort(sortedFlights, Comparator.comparing(Voo::getDepHour));

        try (PrintWriter out = new PrintWriter(new File("Infopublico2.txt"), "UTF-8")) {
            out.printf("%-8s%-11s%-23s%-24s%-10s%-15s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
            for (Voo flight : sortedFlights) {
                out.println(flight);
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar o ficheiro");
            e.printStackTrace();
        }
    }

}
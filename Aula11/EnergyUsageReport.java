package Aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class EnergyUsageReport {
    private Map<Integer, Customer> customerList;

    public EnergyUsageReport() {
        customerList = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customerList.put(customer.getCustomerId(), customer);
    }

    public void removeCustomer(int customerId) {
        customerList.remove(customerId);
    }

    public Customer getCustomer(int customerId) {
        return customerList.get(customerId);
    }

    public void load(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                int ID = Integer.parseInt(parts[0].trim());
                List<Double> readings = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) {
                    readings.add(Double.parseDouble(parts[i].trim()));
                }
                Customer customer = new Customer(ID, readings);
                customerList.put(ID, customer);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (Exception e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }

    public double calculateTotalUsage(int customerId) {
        Customer customer = customerList.get(customerId);
        if (customer == null) {
            return 0;
        }
        List<Double> readings = customer.getMeterReadings();
        double totalUsage = 0;
        for (double reading : readings) {
            totalUsage += reading;
        }
        return totalUsage;
    }

    public void generateReport(String fileName) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (Customer customer : customerList.values()) {
                writer.println(
                        "Customer ID: " + customer.getCustomerId() + ", Total Usage: " + customer.getMeterReadings());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

}

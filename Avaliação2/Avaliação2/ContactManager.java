package Avaliação2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Aula12.Movie;

public class ContactManager implements ContactManagerInterface {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Contact> listaCont = new ArrayList<>();

    public static void load(String filepath) throws FileNotFoundException {

        Scanner input = new Scanner(new File("contactos.txt"), "UTF-8");
        while (input.hasNextLine()) {
            int id = 1;
            String name;
            int phoneNumber;
            String email;
            LocalDate birthDate;
            String line = input.nextLine();

            String[] fields = line.split("\t");

            if (fields.length == 4) {
                name = fields[0];

                try {
                    phoneNumber = Integer.parseInt(fields[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid phone number format");
                    continue;
                }

                try {
                    birthDate = LocalDate.parse(fields[3]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid date format");
                    continue;
                }
                if (isValidEmail(fields[2])) {
                    email = fields[2];
                }

                Contact person = new Contact(id, name, phoneNumber, email, birthDate);
                for (Contact person1 : listaCont) {
                    if (person1.getPhoneNumber() == phoneNumber || person1.getName() == name
                            || person1.getBirthDate() == birthDate || person1.getEmail() == email) {
                        System.out.println("Contact already exists");
                        break;
                    } else
                        listaCont.add(person);

                }
                id++;
            }
        }
    }

    private static boolean isValidEmail(String email) {
        // Regex para verificar o formato do email
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    @Override
    public void save(String filePath) {
        PrintWriter out = new PrintWriter(new File("contacts.txt"));
        for (Contact m : listaCont) {
            out.print(m);
        }
        out.close();

        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public boolean validateEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    @Override
    public boolean validatePhoneNumber(String phoneNumber) {
        return (Integer.parseInt(phoneNumber) >= 100000000 && Integer.parseInt(phoneNumber) > 1000000000);

    }

    @Override
    public boolean addContact(Contact person) {

        listaCont.add(person);

        throw new UnsupportedOperationException("Unimplemented method 'addContact'");
    }

    @Override
    public boolean removeContact(Contact person) {
        listaCont.remove(person);
        throw new UnsupportedOperationException("Unimplemented method 'removeContact'");
    }

    @Override
    public Contact searchContactByname(String name) {

        System.out.print("Introduza o nome: ");
        for (Contact c : listaCont) {
            if (c.getName().equals(name)) {
                System.out.println(c);
            }
            throw new UnsupportedOperationException("Unimplemented method 'searchContactByname'");
        }
    }

    @Override
    public Contact searchContactByEmail(String email) {

        System.out.print("Introduza o email: ");
        for (Contact c : listaCont) {
            if (c.getEmail().equals(email)) {
                System.out.println(c);
            }
            throw new UnsupportedOperationException("Unimplemented method 'searchContactByEmail'");
        }
    }

    @Override
    public Contact searchContactByPhoneNumber(int phoneNumber) {
        System.out.print("Introduza o número: ");
        for (Contact c : listaCont) {
            if (c.getPhoneNumber() == phoneNumber) {
                System.out.println(c);
            }
            throw new UnsupportedOperationException("Unimplemented method 'searchContactByPhoneNumber'");
        }
    }

    @Override
    public void listAllContacts() {
        printlist(listaCont);
        throw new UnsupportedOperationException("Unimplemented method 'listAllContacts'");
    }

    @Override
    public void listContactsByName() {
        listaCont.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        System.out.println(listaCont);
        throw new UnsupportedOperationException("Unimplemented method 'listContactsByName'");
    }

    @Override
    public void listContactsByPhoneNumber() {
        listaCont.sort((a, b) -> Integer.compare(a.getPhoneNumber(), b.getPhoneNumber()));
        System.out.println("-------------------------------------------------------------------------");
        printlist(listaCont);
        throw new UnsupportedOperationException("Unimplemented method 'listContactsByPhoneNumber'");
    }

    @Override
    public void listContactsByBirthDate() {
        listaCont.sort((a, b) -> Integer.compare(a.getBirthDate(), b.getBirthDate()));
        System.out.println("-------------------------------------------------------------------------");
        printlist(listaCont);
        throw new UnsupportedOperationException("Unimplemented method 'listContactsByBirthDate'");
    }

    public static void printlist(ArrayList<Contact> list) {
        for (Contact m : list) {
            System.out.println(m);
        }
    }

}

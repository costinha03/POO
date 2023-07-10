package Avaliação2;

import java.time.LocalDate;
import java.util.Scanner;

import Aula09.PlaneManager;

public class tester {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
    static Scanner sc = new Scanner(
            System.in);ContactManager.load("contactos.txt");System.out.println("Introduza a opção a escolher:");
    int choice;do
    {

        System.out.println("1. Adicionar contacto");
        System.out.println("2. Modificar contacto");
        System.out.println("3. Apagar contacto");
        System.out.println("4. Procurar por nome");
        System.out.println("5. Procurar por número");
        System.out.println("6. Procurar por email");
        System.out.println("7. Listar contactos");
        System.out.println("8. Listar contactos ordenados por nome");
        System.out.println("9. Listar contactos ordenados por telemovel");
        System.out.println("10. Listar contactos ordenados por data de nascimento");
        System.out.println("0. Exit");

        choice = sc.nextInt();

        String email;
        switch (choice) {
            case 1:

            System.out.print("Introduza os dados do contacto");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Número de telefone: ");
            int num = sc.nextInt();
            System.out.println();
            System.out.print("Insira o email: ");
            if (ContactManager.validateEmail(sc.next())) {
                String email = sc.nextLine();
            }
            System.out.print("Insira a data de nascimento AAA/MMM/DDDD");
            LocalDate birthdate = LocalDate.parse(sc.next());
            Contact person = new Contact(00, name, phoneNumber, email, birthDate);
            for (Contact person1 : listaCont) {
                if (person1.getPhoneNumber() == phoneNumber || person1.getName() == name
                        || person1.getBirthDate() == birthDate || person1.getEmail() == email) {
                    System.out.println("Contact already exists");
                    break;
                } else
                    listaCont.add(person);
    
            }

                break;
            case 3:
                System.out.print("Insira o ID do contacto a remover");
                Contact person1 = null;
                for (Contact m : listaCont){
                    if (m.getID() == sc.nextInt()) {
                        person1 = m;
                }                
                ContactManager.removeContact(person)
                break;
            case 4:
                System.out.print("Insira o nome do contacto a pesquisar: ");
                String nome = sc.next();
                ContactManager.searchContactByname(nome);
                break;
            case 5:
            System.out.print("Insira o numero do contacto a pesquisar: ");
            String nome = sc.next();
            ContactManager.searchContactByPhoneNumber(nome);
            
            case 6:
            System.out.print("Insira o email do contacto a pesquisar: ");
            String nome = sc.next();
            ContactManager.searchContactByEmail(nome);
                break;
            case 7:
                ContactManager.listAllContacts();
                break;
            case 8:
                ContactManager.listContactsByName();
                break;
            case 9:
                ContactManager.listContactsByPhoneNumber();
                break;
                case 10:
                ContactManager.listContactsByBirthDate();
                break;      
            case 0:
                System.out.println("A encerrar o programa....");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }


}

}
}

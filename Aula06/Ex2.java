package Aula06;

import Aula06.Contacto;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
            final Contacto classee = new Contacto(null, 0, 0);
            ArrayList <Contacto> contactList;
            Contacto person;
            int id = 0;
            int op;
            do {System.out.print("Escolha uma opção (1-5)");
            System.out.print("1- Inserir contacto \n2- Alterar contacto \n3- Apagar contacto \n4- Procurar contacto \n5- Listar contactos \n 0- Sair");~
            op = sc.nextInt();
            switch(op){
                case 0:
                    System.out.print("A encerrar...");
                    break;
                case 1:
                    System.out.print("Introduza os dados do contacto");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Número de telefone: ");
                    int num = sc.nextInt();
                    System.out.println();
                    System.out.print("Insira o email: ");
                    String email = sc.nextLine();
                    id++;

                    if (classee.validEmail(email)){
                         person = new Contacto(nome, id, num, email);
                        
                    }else { person = new Contacto(nome, id, num);}
                    classee.addContact(person);

                    if (email != ""){
                         person = new Contacto(nome, id, num, email);
                        classee.addContact(person);
                    }else { person = new Contacto(nome, id, num);}
                    classee.addContact(person);


                case 2:
                    System.out.print("Insira o ID do contacto: ");
                    id = sc.nextInt();
                    classee.editContact(id);
                    System.out.print("Introduza os dados do contacto");
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Número de telefone: ");
                    num = sc.nextInt();
                    System.out.println();
                    System.out.print("Insira o email: ");
                    email = sc.nextLine();

                    if (classee.validEmail(email)){
                         person = new Contacto(nome, id, num, email);
                        
                    }else { person = new Contacto(nome, id, num);}
                    classee.addContact(person);

                case 3:
                    System.out.print("Insira o ID do contacto: ");
                    id = sc.nextInt();
                    classee.removeContact(id);
                    break;
                case 4:
                    System.out.print("Insira o ID do contacto: ");
                    int ID = sc.nextInt();
                    classee.searchContact(id);
                    break;
                case 5:
                    classee.listContacts();}
            }while (op != 0);
        }
        }

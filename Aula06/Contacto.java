package Aula06;

import java.util.ArrayList;

import Aula05.dateGen;




public class Contacto extends newPessoa{
    private int ID;
    private int num;
    private String email;
    private static int count = 0;
    private ArrayList <Contacto> contactList;

    public Contacto(String nome,   int ID, int num, String email){
            super(nome);
            if(validNum(num) || validEmail(email)){
            this.ID = count ++;
            this.num = num;
            this.email = email;}
            else {throw new Exception("Insira dados válidos");}
    }
    public Contacto(String nome,  int ID, int num){
        super(nome);
        this.ID = count ++;
        this.num = num;

}   
    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        if (this.getEmail() != "")
        {return super.toString() + "ID: " + this.getID() + ", contacto: " + this.getNum() + ", email: " + this.getEmail();}
        else {return super.toString() + "ID: " + this.getID() + ", contacto: " + this.getNum();}

    }
    

public void addContact(Contacto person){
    contactList.add(person);
}

public void removeContact(int ID){
    for (Contacto contacto : contactList){
        if(contacto.getID() == ID){
            contactList.remove(contacto);
            System.out.println("Contacto removido.");
            return;
        }
    }
    System.out.println("Contacto não encontrado.");
}

public void searchContact(int ID){
    for (Contacto contacto : contactList){
        if(contacto.getID() == ID){
            System.out.println(contacto);
            return;
        }
    }
    System.out.println("Contact not found.");
}

public void listContacts(){
    System.out.println("Lista de contactos: ");
    for (Contacto contacto : contactList){
        System.out.println(contacto);
        }
}

public void editContact(int id){
    for (Contacto contacto : contactList){
        if(contacto.getID() == ID){
            System.out.println(contacto);
            return;
        }
    }
    System.out.println("Contacto não encontrado.");
}
public boolean validNum(int num){
    if(num >= 900000000 || num < 1000000000){
        return true;
    }
    else return false;
}
public boolean validEmail(String email){
    
}
}

    


package Avaliação2;

import java.time.LocalDate;
import java.util.Objects;

public class Contact {
    private int id;
    private String name;
    private int phoneNumber;
    private String email;
    private LocalDate birthDate;

    public Contact(int id, String name, int phoneNumber, String email, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Contact id(int id) {
        setId(id);
        return this;
    }

    public Contact name(String name) {
        setName(name);
        return this;
    }

    public Contact phoneNumber(int phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    public Contact email(String email) {
        setEmail(email);
        return this;
    }

    public Contact birthDate(LocalDate birthDate) {
        setBirthDate(birthDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) o;
        return id == contact.id && Objects.equals(name, contact.name) && phoneNumber == contact.phoneNumber
                && Objects.equals(email, contact.email) && Objects.equals(birthDate, contact.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phoneNumber, email, birthDate);
    }

    @Override
    public String toString() {
        return getId() + ", " + getName() + ", " + getPhoneNumber() + ", " + getEmail() + "," + getBirthDate();
    }

}

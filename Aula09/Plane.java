package Aula09;

public abstract class Plane {
    String Model, ID, Manufacturer;
    int prodYear, maxSpeed, maxPassengers;

    public Plane(String Model, String ID, String Manufacturer, int prodYear, int maxSpeed, int maxPassengers) {
        this.Model = Model;
        this.ID = ID;
        this.Manufacturer = Manufacturer;
        this.prodYear = prodYear;
        this.maxSpeed = maxSpeed;
        this.maxPassengers = maxPassengers;
    }

    public String getModel() {
        return this.Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getManufacturer() {
        return this.Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public int getProdYear() {
        return this.prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public abstract String getPlaneType();

    @Override
    public String toString() {
        return " Modelo: " + getModel() +
                ", ID: " + getID() +
                ", Fabricante: " + getManufacturer() +
                ", Ano de produção: " + getProdYear() +
                ", Velocidade máxima: " + getMaxSpeed() +
                ", Lotação:  " + getMaxPassengers();

    }

}

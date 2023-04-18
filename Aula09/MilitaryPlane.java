package Aula09;

public class MilitaryPlane extends Plane {

    int ammunition;

    public MilitaryPlane(String Model, String ID, String Manufacturer, int prodYear, int maxSpeed, int maxPassengers,
            int ammunition) {
        super(Model, ID, Manufacturer, prodYear, maxSpeed, maxPassengers);
        this.ammunition = ammunition;
    }

    public int getAmmunition() {
        return this.ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    @Override
    public String toString() {
        return super.toString() + "Número de munições: " + getAmmunition();
    }

    @Override
    public String getPlaneType() {
        return "Militar";
    }

}

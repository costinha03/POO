package Aula09;

public class ComercialPlane extends Plane {
    int crewMembers;

    public ComercialPlane(String Model, String ID, String Manufacturer, int prodYear, int maxSpeed, int maxPassengers,
            int crewMembers) {
        super(Model, ID, Manufacturer, prodYear, maxSpeed, maxPassengers);
        this.crewMembers = crewMembers;
    }

    public int getCrewMembers() {
        return this.crewMembers;
    }

    public void setCrewMembers(int crewMembers) {
        this.crewMembers = crewMembers;
    }

    @Override
    public String toString() {
        return super.toString() + "Número de tripulantes: " + getCrewMembers();
    }

    @Override
    public String getPlaneType() {
        return "Comercial";
    }

}

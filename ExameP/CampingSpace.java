package ExameP;

import java.util.Objects;

public class CampingSpace {
    private String location;
    private int[] dimensions;
    private double price;
    private SpaceType type;

    public CampingSpace(String location, int[] dimensions, double price) {
        this.location = location;
        this.dimensions = dimensions;
        this.price = price;
    }

    public String getLocation() {
        return this.location;
    }

    public void setType(SpaceType type) {
        this.type = type;
    }

    public SpaceType getType() {
        return this.type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int[] getDimensions() {
        return this.dimensions;
    }

    public void setDimensions(int[] dimensions) {
        this.dimensions = dimensions;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CampingSpace location(String location) {
        setLocation(location);
        return this;
    }

    public CampingSpace dimensions(int[] dimensions) {
        setDimensions(dimensions);
        return this;
    }

    public CampingSpace price(double price) {
        setPrice(price);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CampingSpace)) {
            return false;
        }
        CampingSpace campingSpace = (CampingSpace) o;
        return Objects.equals(location, campingSpace.location) && Objects.equals(dimensions, campingSpace.dimensions)
                && price == campingSpace.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, dimensions, price);
    }

    @Override
    public String toString() {
        return " Location: " + getLocation() +
                ", Dimensions: " + getDimensions() +
                ", Price: " + getPrice();
    }

}

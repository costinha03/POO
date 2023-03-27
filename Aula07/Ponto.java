package Aula07;

import java.util.Objects;

public class Ponto {
    private double x;
    private double y;

    

    public Ponto() {

    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // getters

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    

    @Override
    public String toString() {
        return "Ponto [x=" + x + ", y=" + y + "]";
    }



    // outros métodos

    public double distanceTo(Ponto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));

    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ponto)) {
            return false;
        }
        Ponto ponto = (Ponto) o;
        return x == ponto.x && y == ponto.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}

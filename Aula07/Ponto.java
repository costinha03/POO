package Aula07;

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
}

package Aula07;



public class Circulo extends Forma {
    private double raio;
    private Ponto centro;

    // classes abstracta

    public double area() {
        return Math.PI * raio * raio;
    }

    public double perimetro() {
        return Math.PI * 2 * this.raio;
    }

    public String cor() {
        return getCor();
    }


    public Circulo(String cor) {
        super(cor);
        this.centro = new Ponto(0, 0);
        this.raio = 1;
    }

    public Circulo(double raio, String cor) {
        super(cor);
        this.centro = new Ponto(0, 0);
        this.raio = raio;
    }

    public Circulo(Ponto centro, String cor) {
        super(cor);
        this.centro = centro;
        this.raio = 1;
    }

    public Circulo(Ponto centro, double raio, String cor) {
        super(cor);
        this.centro = centro;
        this.raio = raio;
    }


    public double getRaio() {
        return raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    // Overrides

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", centro=" + centro + ", Area=" + area() + ", Perimetro=" + perimetro()
                + "]";
    }


    // outros métodos
    public boolean intersectsWith(Circulo c) {
        double d = this.centro.distanceTo(c.centro);

        if (d < this.raio + c.raio) {
            return true;
        } else {
            return false;
        }
    }
}


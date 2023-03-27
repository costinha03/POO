package Aula07;

public class Retangulo extends Forma {
    private double comp;
    private double alt;

    // classe abstracta

    public double area() {
        return comp * alt;
    }

    public double perimetro() {
        return 2 * (comp + alt);
    }

    public String cor() {
        return getCor();
    }

    // Contrutor

    public Retangulo(double comp, double alt, String cor) {
        super(cor);
        this.comp = comp;
        this.alt = alt;
    }

    // getters e setters

    public double getComp() {
        return comp;
    }

    public double getAlt() {
        return alt;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    // Overrides

    @Override
    public String toString() {
        return "Retangulo [comprimento=" + comp + ", altura=" + alt + ", Area=" + area() + ", Perimetro=" + perimetro()
                + "]";
    }



}
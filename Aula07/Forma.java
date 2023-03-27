package Aula07;

public abstract class Forma {
    private String cor;

    public abstract double area();

    public abstract double perimetro();

    public abstract String cor();

    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    @Override
    public String toString() {
        return "Cor: " + getCor();
    }
}

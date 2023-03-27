package Aula07;

public class Ex1 {
    public static void main(String[] args)
    {Circulo c1 = new Circulo(new Ponto(1, 2), 3, "verde");
    Circulo c2 = new Circulo(new Ponto(2, 3), 4, "azul");
    Retangulo r1 = new Retangulo(3, 6, "vermelho");
    Retangulo r2 = new Retangulo(3, 6, "vermelho");
    Triangulo t1 = new Triangulo(2, 4, 5, "amarelo");
    Triangulo t2  = new Triangulo(2, 4, 5, "amarelo");

    System.out.println(c1.toString());
    System.out.println(r1.toString());
    System.out.println(t1.toString());
    System.out.println(c1.equals(c2));
    System.out.println(r1.equals(r2));
    System.out.println(t1.equals(t2));
}
}

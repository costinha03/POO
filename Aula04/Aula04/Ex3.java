package Aula04;

public class Ex3 {
    
        public static void main(String[] args) {
            Circulo c1 = new Circulo(new Ponto(1, 2), 3);
            Circulo c2 = new Circulo(new Ponto(2, 3), 4);
            Retangulo r1 = new Retangulo(3, 6);
            Retangulo r2 = new Retangulo(3, 6);
            Triangulo t1 = new Triangulo(2, 4, 5);
    
            System.out.println(c1.toString());
            System.out.println(r1.toString());
            System.out.println(t1.toString());
            System.out.println(c1.equals(c2));
            System.out.println(r1.equals(r2));
        }
    }


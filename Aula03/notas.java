package Aula03;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        
        double[][] notas = new double[5][3];
    
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
          System.out.printf("Digite as notas (teórica, prática, trabalho) do aluno %d: ", i+1);
          notas[i][0] = sc.nextDouble();
          notas[i][1] = sc.nextDouble();
          notas[i][2] = sc.nextDouble();
        }
    

        System.out.println("NotaT\tNotaP\tNotaTrab\tMedia\tPauta");
        for (int i = 0; i < notas.length; i++) {
          double media = (notas[i][0] * 0.4) + (notas[i][1] * 0.4) + (notas[i][2] * 0.2);
          int pauta = (int) Math.round(media);
          System.out.printf("%.1f\t%.1f\t%.1f\t%.1f\t%d\n", notas[i][0], notas[i][1], notas[i][2], media, pauta);
        }
     sc.close(); }
}

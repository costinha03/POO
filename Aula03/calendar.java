package Aula03;

import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {

        int mes, ano, diaDaSemana;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o mês (mm/yyyy): ");
            String data = sc.nextLine();
            mes = Integer.parseInt(data.substring(0, 2));
            ano = Integer.parseInt(data.substring(3));
            System.out.print("Digite o dia da semana em que começa o mês (1=Segunda, 2=Terça, 3=Quarta, 4=Quinta, 5=Sexta, 6=Sábado, 7=Domingo): ");
            diaDaSemana = sc.nextInt();
        } while (!validaData(mes, ano) || diaDaSemana < 1 || diaDaSemana > 7);

        
        String nomeMes = nomeMes(mes) + " " + ano;
        int diasNoMes = diasNoMes(mes, ano);
        System.out.println(nomeMes);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 1; i < diaDaSemana; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= diasNoMes; i++) {
            System.out.printf("%2d ", i);
            if ((i + diaDaSemana - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }



    public static boolean validaData(int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (ano < 0) {
            return false;
        }
        return true;
    }


    public static int diasNoMes(int mes, int ano) {
        int[] diasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && anoBissexto(ano)) {
            return 29;
        } else {
            return diasNoMes[mes-1];
        }
    }


    public static boolean anoBissexto(int ano) {
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }


    public static String nomeMes(int mes) {
        String[] nomes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return nomes[mes-1];
    }
    
}

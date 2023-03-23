package Aula02;
import java.util.Scanner;
public class secToHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secf, min, hours, sec;
        System.out.print("Insira o tempo em segundos: ");
        sec = sc.nextInt();
        hours = sec/3600;
        min = sec/60-hours*60;
        secf = sec%3600-min*60;
        System.out.printf("%02d:%02d:%02d", hours, min, secf);

        sc.close();
}
}
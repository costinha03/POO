package Aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class specialCounter {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("Lusiadas.txt"));
        ArrayList<String> longwords = new ArrayList<>();
        ArrayList<String> finalS = new ArrayList<>();
        while (input.hasNext()) {
            String word = input.next();
            if (word.length() > 2) {
                if (!longwords.contains(word)) {
                    longwords.add(word);
                }
            }
            if (word.toLowerCase().endsWith("s")) {
                if (!finalS.contains(word)) {
                    finalS.add(word);
                }
            }
            for (char c : word.toCharArray()) {
                if (!Character.isLetter(c)) {
                    if (longwords.contains(word)) {
                        longwords.remove(word);
                    }

                    if (finalS.contains(word)) {
                        finalS.remove(word);
                    }
                }
            }
        }
        System.out.println("Palavras com mais de 2 letras: ");
        System.out.println(longwords);
        System.out.println("Palavras terminadas em 's':  ");
        System.out.println(finalS);

    }

}
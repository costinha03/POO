package Aula10;

import java.util.*;

public class Counter {
    public static void main(String[] args) {
        String frase = "Hello World";
        Map<Character, List<Integer>> caracteres = new HashMap<>();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (!caracteres.containsKey(c)) {
                caracteres.put(c, new ArrayList<Integer>());
            }

            caracteres.get(c).add(i);
        }

        System.out.println(caracteres);
    }

}

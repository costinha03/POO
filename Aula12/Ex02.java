package Aula12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("A_cidade_e_as_serras.txt"), "UTF-8");
        input.useDelimiter("[\\p{Punct}\\s]+");
        Map<String, HashMap<String, Integer>> words = new HashMap<>();

        while (input.hasNext()) {
            String word = input.next().toLowerCase();
            if (word.length() >= 3) { // only consider words with 3 or more characters
                String firstLetter = String.valueOf(word.charAt(0));
                if (!words.containsKey(firstLetter)) {
                    HashMap<String, Integer> counter = new HashMap<>();
                    counter.put(word, 1);
                    words.put(firstLetter, counter);
                } else {
                    HashMap<String, Integer> counter = words.get(firstLetter);
                    counter.put(word, counter.getOrDefault(word, 0) + 1);
                }
            }
        }
        input.close();

        // sort the words alphabetically
        List<String> sortedKeys = new ArrayList<>(words.keySet());
        Collections.sort(sortedKeys);

        // write the results to a file
        FileWriter writer = new FileWriter(new File("output.txt"));
        for (String key : sortedKeys) {
            HashMap<String, Integer> counter = words.get(key);
            List<String> sortedWords = new ArrayList<>(counter.keySet());
            Collections.sort(sortedWords);
            writer.write(key + ": ");
            for (String word : sortedWords) {
                writer.write(word + ", " + counter.get(word) + "; ");
            }
            writer.write("\n");
        }
        writer.close();

        System.out.println("Done!");
    }
}

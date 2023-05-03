package Aula10;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Counter {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] arr = str.replaceAll("\\s+", "").toCharArray();
        Map<Character, TreeSet<Integer>> mapa = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            Character c = arr[i];
            if (mapa.containsKey(c)) {
                mapa.get(c).add(i);
            } else {
                TreeSet<Integer> set = new TreeSet<>();
                set.add(i);
                mapa.put(c, set);
            }

        }

        System.out.println(mapa.entrySet());
    }

}

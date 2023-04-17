package Aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import Aula05.dateGen;

public class ALDemo {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        c1.add(25);
        Collections.sort(c1);
        System.out.println(c1);
        System.out.println(c2.lastIndexOf("Chuva"));
        System.out.println(c2.lastIndexOf("Vento"));

        Set<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Alberto Silva", 1151213265, new dateGen(11, 7, 1980)));
        c3.add(new Pessoa("Carlos António", 1562626258, new dateGen(25, 2, 1995)));
        c3.add(new Pessoa("Simão Pedrosa", 1224521521, new dateGen(14, 12, 2020)));
        c3.add(new Pessoa("Joaquim Costa", 115121544, new dateGen(22, 1, 1965)));
        c3.add(new Pessoa("Óscar Pedro", 1325544515, new dateGen(13, 4, 1745)));

        Iterator<Pessoa> i = c3.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Set<dateGen> c4 = new TreeSet<>();

        c4.add(new dateGen(11, 7, 1985));
        c4.add(new dateGen(18, 7, 1986));
        c4.add(new dateGen(11, 8, 1985));
        c4.add(new dateGen(11, 8, 1985));
        c4.add(new dateGen(10, 7, 1985));

        Iterator<dateGen> j = c4.iterator();

        while (j.hasNext()) {
            System.out.println(j.next());
        }

    }
}
package Aula12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Ex03 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("movies.txt"), "UTF-8");
        Set<Movie> movieList = new HashSet<>(); // primeiro armazenar num set para garantir que não há filmes repetidos
        HashSet<String> genset = new HashSet<>();
        while (input.hasNext()) {
            double score;
            int runningTime;
            String line = input.nextLine();

            String[] fields = line.split("\t");

            String name = fields[0];

            try {
                score = Double.parseDouble(fields[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid score format");
                continue;
            }
            String rating = fields[2];
            String genre = fields[3];

            try {
                runningTime = Integer.parseInt(fields[4]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid running time format");
                continue;
            }

            Movie movie = new Movie(name, score, rating, genre, runningTime);
            if (!movieList.contains(movie)) {
                movieList.add(movie);
            }
            genset.add(genre);

        }
        ArrayList<Movie> sortedMovieList = new ArrayList<>(movieList);
        Collections.sort(sortedMovieList, Comparator.comparing(Movie::getName));
        System.out.printf("%-40s%-10s%-10s%-10s%-15s\n", "Name", "Score", "Rating", "Genre", "Run Time");

        sortedMovieList.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        printlist(sortedMovieList);

        sortedMovieList.sort((a, b) -> Double.compare(b.getScore(), a.getScore()));
        System.out.println("-------------------------------------------------------------------------");
        printlist(sortedMovieList);

        sortedMovieList.sort((a, b) -> Integer.compare(a.getRunningTime(), b.getRunningTime()));
        System.out.println("-------------------------------------------------------------------------");
        printlist(sortedMovieList);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println(genset);

        PrintWriter out = new PrintWriter(new File("myselection.txt"));
        out.printf("%-40s%-10s%-10s%-10s%-15s\n", "Name", "Score", "Rating", "Genre", "Run Time");
        for (Movie m : sortedMovieList) {
            if (m.getScore() > 60.0 && m.getGenre().equals("comedy")) {
                out.println(m);
            }
        }
        out.close();
    }

    public static void printlist(ArrayList<Movie> list) {
        for (Movie m : list) {
            System.out.println(m);
        }
    }
}

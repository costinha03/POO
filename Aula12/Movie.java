package Aula12;

import java.util.Objects;

public class Movie {
    private String name;
    private double score;
    private String rating;
    private String genre;
    private int runningTime;

    public Movie(String name, double score, String rating, String genre, int runningTime) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runningTime = runningTime;
    }

    public String getName() {
        return this.name;
    }

    public double getScore() {
        return this.score;
    }

    public String getRating() {
        return this.rating;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getRunningTime() {
        return this.runningTime;
    }

    @Override
    public String toString() {
        return String.format("%-40s%-10.1f%-10s%-10s%-15d", name, score, rating, genre, runningTime);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Movie)) {
            return false;
        }
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) && score == movie.score && Objects.equals(rating, movie.rating)
                && Objects.equals(genre, movie.genre) && runningTime == movie.runningTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}

package Aula11;

import java.io.*;
import java.util.*;
import java.time.LocalTime;
import java.util.Objects;

public class Voo {
    private LocalTime depHour;
    private String flight;
    private String company;
    private String departure;
    private LocalTime delay;
    private String obs;

    public Voo(LocalTime depHour, String flight, String company, String departure, LocalTime delay, String obs) {
        this.depHour = depHour;
        this.flight = flight;
        this.company = company;
        this.departure = departure;
        this.delay = delay;
        this.obs = obs;
    }

    public LocalTime getDepHour() {
        return this.depHour;
    }

    public String getFlight() {
        return this.flight;
    }

    public String getCompany() {
        return this.company;
    }

    public String getDeparture() {
        return this.departure;
    }

    public LocalTime getDelay() {
        return this.delay;
    }

    public String getObs() {
        return this.obs;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Voo)) {
            return false;
        }
        Voo voo = (Voo) o;
        return Objects.equals(depHour, voo.depHour) && Objects.equals(flight, voo.flight)
                && Objects.equals(company, voo.company) && Objects.equals(departure, voo.departure)
                && Objects.equals(delay, voo.delay) && Objects.equals(obs, voo.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(depHour, flight, company, departure, delay, obs);
    }

    @Override
    public String toString() {
        return String.format("%-8s%-11s%-23s%-24s%-10s%-15s\n", depHour, flight, company, departure, delay, obs);
    }

}

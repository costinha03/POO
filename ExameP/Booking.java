package ExameP;

import java.time.LocalDate;
import java.util.Objects;

public class Booking {
    private CampingSpace space;
    private LocalDate start;
    private int end;
    private int id;

    public Booking() {
    }

    public Booking(Integer id, CampingSpace space, LocalDate start, int end) {
        this.id = id;
        this.space = space;
        this.start = start;
        this.end = end;
    }

    public int getid() {
        return this.id;
    }

    public void id(int id) {
        this.id = id;
    }

    public CampingSpace getSpace() {
        return this.space;
    }

    public void setSpace(CampingSpace space) {
        this.space = space;
    }

    public LocalDate getStart() {
        return this.start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public int getEnd() {
        return this.end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public Booking space(CampingSpace space) {
        setSpace(space);
        return this;
    }

    public Booking start(LocalDate start) {
        setStart(start);
        return this;
    }

    public Booking end(LocalDate end) {
        setEnd(end);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Booking)) {
            return false;
        }
        Booking booking = (Booking) o;
        return Objects.equals(space, booking.space) && Objects.equals(start, booking.start)
                && Objects.equals(end, booking.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(space, start, end);
    }

    @Override
    public String toString() {
        return "Space: " + getSpace() + ", Start date: " + getStart() + ", End date: " + getEnd();
    }

}

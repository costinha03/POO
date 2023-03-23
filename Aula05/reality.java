package Aula05;

public class reality {
    private int rooms;
    private static int baseId = 1000;
    private int id;
    private String city;
    private double price;
    private boolean available;
    private dateGen aucStart;
    private dateGen aucEnd;

    public reality(int rooms, double price, String city){
        this.id = baseId++;
        this.city = city;
        this.rooms = rooms;
        this.price = price;
        this.available = true;
    }


    public int getRooms() {
        return this.rooms;
    }

    public int getId() {
        return this.id;
    }

    public String getCity() {
        return this.city;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public dateGen getAucStart() {
        return this.aucStart;
    }

    public dateGen getAucEnd() {
        return this.aucEnd;
    }
public void setAuction(dateGen start, dateGen end ){
    if (available){
        aucStart = start;
        aucEnd = end;
        System.out.println("Real estate " + id + " is placed to auction.");
    }
    else{
        System.out.println("Real estate " + id + " is not available"); 
    }
}
public void sell(){
    if (available){

        System.out.println("Real estate " + id + " sold");
        available = false;
    }
    else{
        System.out.println("Real estate " + id + " is not available"); 
    }
}
public void becomeUnavailable(){
    available = false;
    System.out.println("Real estate " + id + " is now unavailable");
}
public String toString(){
    String result = "Real Estate: " + id + "; rooms: " + rooms + "; city: " + city + "; price: " + price;
    if (aucStart != null || aucEnd != null){
        result += "; start of auction: " + aucStart + "; end of auction: " + aucEnd;
    }
    return result;
}

}




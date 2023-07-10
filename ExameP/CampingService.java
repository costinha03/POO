package ExameP;

import java.time.LocalDate;
import java.util.*;

public class CampingService implements CampingServiceInterface {
    private String name1;
    private String name2;

    private Set<CampingSpace> Spaces = new HashSet<>();
    private Set<Client> clients = new HashSet<>();
    private Map<Client, ArrayList<Booking>> campingPerClient = new HashMap<>();
    private Set<Booking> bookings = new HashSet<>();

    public CampingService(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;

    }

    public String getName1() {
        return this.name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return this.name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public Set<CampingSpace> getSpaces() {
        return this.Spaces;
    }

    public void setSpaces(Set<CampingSpace> Spaces) {
        this.Spaces = Spaces;
    }

    public Set<Client> getClients() {
        return this.clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Map<Client, ArrayList<Booking>> getCampingPerClient() {
        return this.campingPerClient;
    }

    public void setCampingPerClient(Map<Client, ArrayList<Booking>> campingPerClient) {
        this.campingPerClient = campingPerClient;
    }

    public Set<Booking> getBookings() {
        return this.bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override
    public boolean registerClient(int taxId, String name, ClientType type) {
        Client person = new Client(taxId, name, type);
        clients.add(person);
        return true;

    }

    @Override
    public Client getClient(int taxId) {
        Client client = null;
        for (Client cli : clients) {
            if (cli.getTaxId() == taxId)
                client = cli;
            return cli;
        }
        if (client == null) {
            System.out.println("Client not found");
        }
        return client;

    }

    @Override
    public void addCampingSpace(CampingSpace campingSpace) {
        Spaces.add(campingSpace);
        // TODO Auto-generated method stub

    }

    @Override
    public void addCampingSpaces(Collection<CampingSpace> campingSpaces) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCampingSpaces'");
    }

    @Override
    public boolean checkAvailable(CampingSpace campingSpace, LocalDate startDate, LocalDate endDate) {
        for (CampingSpace space : Spaces) {
            if (space.getClass() != campingSpace.getClass()) {
                return true;

            }
        }

        throw new UnsupportedOperationException("Unimplemented method 'checkAvailable'");
    }

    @Override
    public List<CampingSpace> findAvailableCampingSpaces(SpaceType spaceType, LocalDate fromDate, int duration,
            int[] minDimensions) {

    }

    @Override
    public boolean bookCampingSpace(Client client, CampingSpace campingSpace, LocalDate startDate, int duration) {
        if (!(client.getTipo().toString() == "NORMAL") && !(campingSpace.getType().toString() == "Caravan")) {
            return true;
        } else
            return false;

    }

    @Override
    public double calculateTotalCost(CampingSpace campingSpace, int duration) {
        return campingSpace.getPrice() * duration;

    }

    @Override
    public List<String> listBookings(SpaceType spaceType) {
        List<String> bookingList = new ArrayList<>();
        for (Booking booking : bookings) {
            if (spaceType.equals(booking.getSpace().getType())) {
                bookingList.add(booking.toString());
            }
        }
        throw new UnsupportedOperationException("Unimplemented method 'listBookings'");
    }

}

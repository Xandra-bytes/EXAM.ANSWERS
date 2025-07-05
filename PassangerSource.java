  import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random;

    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }

    public boolean requestPickup() {
        Passenger passenger = new Passenger();
        Location pickupLocation = generateRandomLocation();
        Location destinationLocation = generateRandomLocation();

        return company.scheduleVehicle(passenger, pickupLocation, destinationLocation); }

    private Location generateRandomLocation() {
        int x = random.nextInt(101); 
        int y = random.nextInt(101);
        return new Location(x, y);
    }
}

class Passenger {
    private final String name;
    public Passanger(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class Company {
    public boolean scheduleVehicle(Passenger passenger, Location pickupLocation, Location destinationLocation) {
    }
}
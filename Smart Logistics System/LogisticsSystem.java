import java.util.ArrayList;
import java.util.List;

abstract class Transport {
    String trackingId;
    String destination;

    public Transport(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }

    abstract void dispatch();
}

interface GPS {
    String getCoordinates();
}

interface Autonomous {
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {

    public DeliveryDrone(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }

    @Override
    public String getCoordinates() {
        return "40.71° N, 74.00° W";
    }

    @Override
    public void selfNavigate() {
        System.out.println("Drone navigating autonomously...");
    }
}

class Truck extends Transport implements GPS {

    public Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Truck " + trackingId + " leaving warehouse...");
    }

    @Override
    public String getCoordinates() {
        return "28.7041° N, 77.1025° E";
    }
}

class CargoShip extends Transport {

    public CargoShip(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Cargo Ship " + trackingId + " sailing...");
    }
}

public class LogisticsSystem {
    public static void main(String[] args) {
        Transport t = new DeliveryDrone("D101", "New York");
        t.dispatch();  

        GPS g = new DeliveryDrone("D101", "New York");
        System.out.println(g.getCoordinates());

        List<Transport> transports = new ArrayList<>();
        transports.add(new DeliveryDrone("D102", "LA"));
        transports.add(new Truck("T201", "Delhi"));
        transports.add(new CargoShip("S301", "Dubai"));

        System.out.println("\n--- Dispatching All ---");

        for (Transport transport : transports) {
            transport.dispatch();

            if (transport instanceof GPS) {
                GPS gpsDevice = (GPS) transport;
                System.out.println("Coordinates: " + gpsDevice.getCoordinates());
            }

            if (transport instanceof Autonomous) {
                Autonomous auto = (Autonomous) transport;
                auto.selfNavigate();
            }

            System.out.println();
        }
    }
}

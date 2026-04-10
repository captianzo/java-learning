abstract class Device {
    String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    abstract void turnOn();
}

interface RemoteControllable {
    void connectToWifi();
}

interface PowerSaving {
    int getEnergyRating();
}

class SmartTV extends Device implements RemoteControllable, PowerSaving {

    public SmartTV(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " Smart TV is turning on...");
    }

    @Override
    public void connectToWifi() {
        System.out.println(brand + " Smart TV connected to WiFi.");
    }

    @Override
    public int getEnergyRating() {
        return 5;
    }
}

class ElectricKettle extends Device {

    public ElectricKettle(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " Kettle is heating water...");
    }
}

public class SmartHome {
    public static void main(String[] args) {

        // Normal object
        SmartTV tv = new SmartTV("Samsung");

        // Upcasting to Device
        Device device = tv;
        device.turnOn();  // Calls SmartTV's implementation

        // Upcasting to RemoteControllable
        RemoteControllable remote = tv;
        remote.connectToWifi();

        // Upcasting to PowerSaving
        PowerSaving power = tv;
        System.out.println("Energy Rating: " + power.getEnergyRating());

        System.out.println();

        // Electric Kettle
        Device kettle = new ElectricKettle("Philips");
        kettle.turnOn();
    }
}

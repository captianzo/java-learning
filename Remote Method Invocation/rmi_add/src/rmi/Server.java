package rmi; // Add this line!

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Calculator obj = new CalculatorImpl();
            // Using 1099 as default
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("CalcService", obj); 

            System.out.println("Server started on port 1099...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Calculator stub = (Calculator) registry.lookup("CalcService");

            // Example calls
            System.out.println("Addition (10+5): " + stub.add(10, 5));
            System.out.println("Subtraction (10-5): " + stub.sub(10, 5));
            System.out.println("Multiplication (10*5): " + stub.mul(10, 5));
            System.out.println("Division (10/5): " + stub.div(10, 5));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
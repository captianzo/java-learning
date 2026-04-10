import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // 1. Get the registry from the server (localhost, port 2000)
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 2000);

            // 2. Look up the remote object by its bound name
            HelloService stub = (HelloService) registry.lookup("HelloService");

            // 3. Call the remote method
            String response = stub.sayHello();

            System.out.println("Response from server: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
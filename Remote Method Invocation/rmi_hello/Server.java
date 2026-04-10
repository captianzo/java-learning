import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // 1. Create the remote object
            HelloService helloService = new HelloServiceImpl();

            // 2. Start the RMI registry locally on the default port 2000
            Registry registry = LocateRegistry.createRegistry(2000);

            // 3. Bind the remote object to the registry with a unique name
            registry.rebind("HelloService", helloService);

            System.out.println("RMI Server is running and waiting for requests...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
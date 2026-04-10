import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {
    
    // Constructor must throw RemoteException
    protected HelloServiceImpl() throws RemoteException {
        super();
    }

    // Implement the interface method
    @Override
    public String sayHello() throws RemoteException {
        return "Hello, World from the RMI Server!";
    }
}
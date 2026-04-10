import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {
    // A simple method that returns a string
    String sayHello() throws RemoteException;
}
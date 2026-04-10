package src.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class ChatServer {
    public static void main(String[] args) {
        try {
            ChatImpl chat = new ChatImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Chat", chat);
            System.out.println("Chat server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
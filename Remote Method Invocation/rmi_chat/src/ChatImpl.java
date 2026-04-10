package rmi;

import java.util.List;
import java.util.ArrayList;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatImpl extends UnicastRemoteObject implements ChatInterface {
	List<ClientCallback> clients;

	public ChatImpl() throws RemoteException {
		clients = new ArrayList<>();
	}

	public void registerClient(ClientCallback client){
		clients.add(client);
		System.out.println("Client Connected....");
	}
}

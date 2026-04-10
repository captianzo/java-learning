package rmi;

import java.rmi.*;

public interface ChatInterface extends Remote {
	void sendMessage(String msg) throws RemoteException;

	void registerClient(ClientCallback client) throws RemoteException;
}
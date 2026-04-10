package rmi;

import java.rmi.*;

public interface ClientCallback extends Remote {
	void receiveMessage(String msg) throws RemoteException;
}

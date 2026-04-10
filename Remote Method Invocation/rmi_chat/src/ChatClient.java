package rmi;
import java.rmi.server.UnicastRemoteObject;

public class ChatClient extends UnicastRemoteObject implements ClientCallback {
	protected ChatClient() throws Exception {
		super();
	}

	public void receiveMessage(String msg) {
		System.out.println(msg);
	}
}

package chat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(5000);
		System.out.println("Server Started....");

		Socket socket = server.accept();

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

		String msg;
		while ((msg = in.readLine()) != null) {
			System.out.println("Client: " + msg);
			out.println("Server reply: " + msg);
		}

		socket.close();
		server.close();
	}
}
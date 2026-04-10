package chat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Client {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 5000);

		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

		String msg;
		while (true) {
			System.out.println("Enter message: ");
			msg = userInput.readLine();

			out.println(msg);
			System.out.println(in.readLine());
		}
	}
}
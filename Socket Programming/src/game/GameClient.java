package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GameClient {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 6000);

		BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

		while (true) { 
			System.out.println("Enter guess (1-100): ");
			String guess = user.readLine();

			out.println(guess);
			String response = in.readLine();

			System.out.println(response);

			if (response.equals("Correct!")) break;
		}

		socket.close();
	}
}


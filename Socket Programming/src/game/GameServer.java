package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class GameServer {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(6000);
		System.out.println("Game Server Started....");

		Socket socket = server.accept();

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

		int number = new Random().nextInt(100) + 1;
		int guess;

		while (true) { 
			guess = Integer.parseInt(in.readLine());

			if (guess == number) {
				out.println("Correct!");
				break;
			}
			else if (guess > number) {
				out.println("Too High");
			}
			else {
				out.println("Too Low");
			}
		}

		socket.close();
		server.close();
	}
}
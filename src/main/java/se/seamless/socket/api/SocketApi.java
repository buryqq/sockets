package se.seamless.socket.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketApi {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(1234);
		Socket client = server.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			if (line.equals("exit")) {
				break;
			}
		}
	}
}

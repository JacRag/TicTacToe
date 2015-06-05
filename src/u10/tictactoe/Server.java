package u10.tictactoe;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	public static final int PORT = 9997;
	public static ArrayList<Connection> clients = new ArrayList<Connection>();
	public static int players = 0;
	public static ServerSocket serverSocket;

	public Server() throws Exception {
		serverSocket = new ServerSocket(PORT);

		Thread ac = new Thread(new AcceptConnection());
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Server server = new Server();
		

	}

}

class AcceptConnection implements Runnable {

	public AcceptConnection() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			try {
				Socket s = Server.serverSocket.accept();
				Server.clients.add(s);
			} catch (IOException e) {
			
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}

}

class HandleQueue implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

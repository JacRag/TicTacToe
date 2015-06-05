package u10.tictactoe;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connection {
	private ObjectOutputStream out;
	private ObjectInputStream in;
	private Socket s;
	
	public Connection(Socket s) {
		this.s = s;
		try {
			in = (ObjectInputStream) s.getInputStream();
			out = (ObjectOutputStream) s.getOutputStream();
		} catch (IOException e) {
			
		}
	}

	public ObjectOutputStream getOut() {
		return out;
	}

	public ObjectInputStream getIn() {
		return in;
	}

	public Socket getS() {
		return s;
	}

}

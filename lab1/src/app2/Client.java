package app2;

import java.io.*;
import java.net.*;

public class Client {
	private String host;
	private int port;
	private String fileName;
	
	public Client(String host, String port, String fileName) {
		this.host = host;
		this.port = Integer.parseInt(port);
		this.fileName = fileName;
	}
	
	public void run() throws IOException {
		Socket socket = null;
		PrintWriter out = null;
		BufferedReader in = null;

		try {
			socket = new Socket(host, port);
			out = new PrintWriter(socket.getOutputStream(), true);
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		// deschid fisierul
		File file = new File(fileName);
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		
		// trimit serverului numele fisierul
		out.println(fileName);
		
		// trimit fisierul, linie cu linie
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
			out.println(line);
		}
		
		socket.close();
	}
}

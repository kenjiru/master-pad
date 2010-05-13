package app2;

import java.io.*;
import java.net.*;

public class ServerThread extends Thread {
	private Socket socket = null;
	
	public ServerThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		BufferedReader in;
		BufferedWriter out = null;
		
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// citesc numele fisierului
			String line = in.readLine();
			System.out.println("FileName: " + line);
			
			// creez fisierul
			out = new BufferedWriter(new FileWriter(new File("server/" + line)));
			
			// scriu in fisier
			while ((line = in.readLine()) != null) {
				out.write(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 

		try {
			if (out != null)
				out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

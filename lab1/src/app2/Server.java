package app2;

import java.io.*;
import java.net.*;

public class Server {
	int port;
	
	public Server(String port) {
		this.port = Integer.parseInt(port);
	}
	
	public void run() throws IOException {
		ServerSocket serverSocket = null;
	    boolean listening = true;
	
        serverSocket = new ServerSocket(port);
        
        // pentru fiecare client pornesc un thread nou
        while (listening)
	    	new ServerThread(serverSocket.accept()).start();

		serverSocket.close();
	}
}
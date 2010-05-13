package app1;

import java.io.*;
import java.net.*;

public class Client {
	private String host;
	private int port;
	private String message;
	
	public Client(String host, String port, String message) {
		this.host = host;
		this.port = Integer.parseInt(port);
		this.message = message;
	}
	
	public void run() throws IOException {
		// get a datagram socket
		DatagramSocket socket = new DatagramSocket();

		// send request
		byte[] buf = message.getBytes();
		InetAddress address = InetAddress.getByName(host);
		DatagramPacket packet = new DatagramPacket(buf, buf.length, address, port);
		socket.send(packet);
		
		if (message.equals("shutdown") == true) {
			socket.close();
			return;
		}

		// get response
		packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);

		// display response
		String received = new String(packet.getData(), 0, packet.getLength());
		System.out.println("Response from server: " + received);

		socket.close();
	}
}
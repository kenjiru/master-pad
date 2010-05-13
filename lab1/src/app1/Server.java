package app1;

import java.io.*;
import java.net.*;

public class Server {
	private DatagramSocket socket = null;
	private int port;

	public Server(String port) {
		this.port = Integer.parseInt(port);
	}

	public void run() throws IOException {
		try {
			socket = new DatagramSocket(port);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
		while (true) {
			byte[] buf = new byte[256];

			// receive request
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			
			String message = new String (packet.getData(), 0, packet.getLength());
			
			// respond with a "pong"
			if (message.equals("ping")) {
				String response = "pong";
				buf = response.getBytes();
				
				// send the response to the client at "address" and "port"
				InetAddress address = packet.getAddress();
				int port = packet.getPort();
				packet = new DatagramPacket(buf, buf.length, address, port);
				socket.send(packet);
			}
			
			// shutdown
			if (message.equals("shutdown")) {
				socket.close();
				return;
			}
		}
	}
}

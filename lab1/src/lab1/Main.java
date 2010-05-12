package lab1;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			Main.usage();
			return;
		}
		
		if (args[0].equals("-client")) {
			if (args.length != 4) {
				Main.usage();
				return;
			}
			
			Client c = new Client (args[1], args[2], args[3]);
			try {
				c.run();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if (args[0].equals("-server")) {
			if (args.length != 2) {
				Main.usage();
				return;
			}
			
			Server s = new Server (args[1]);
			try {
				s.run();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void usage() {
		System.out.println("Usage: ");
		System.out.println("\t java lab1 -client <serverHostname> <serverPort> <message>");
		System.out.println("\t java lab1 -server <serverPort>");
	}

}

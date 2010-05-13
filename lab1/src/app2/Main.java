package app2;

import java.io.*;

import app2.Client;
import app2.Server;

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
		System.out.println("Utilizare: ");
		System.out.println("\t java app2.Main -client <serverHostname> <serverPort> <fileName>");
		System.out.println("\t java app2.Main -server <serverPort>");
		System.out.println("\t Serverul salveaza fisierele primite in directorul 'server\' din calea curenta!");
		System.out.println("\t Acest director trebuie creat in prealabil.");

	}
}

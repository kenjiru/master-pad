package app;

import java.io.IOException;
import java.rmi.RMISecurityManager;

public class Main {
	
	public static void main(String[] args) {
		if (System.getSecurityManager() == null) {
        	RMISecurityManager rmiSM = new RMISecurityManager();
        	System.setSecurityManager(rmiSM);
        }
		
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
			c.run();
		}
		
		if (args[0].equals("-server")) {
			if (args.length != 2) {
				Main.usage();
				return;
			}
			
			Server s = new Server (args[1]);
			s.run();
		}
	}
	
	public static void usage() {
		System.out.println("Utilizare: ");
		System.out.println("\t java app1.Main -client <serverHostname> <serverPort> <interfata>");
		System.out.println("\t java app1.Main -server <serverPort>");

	}
}

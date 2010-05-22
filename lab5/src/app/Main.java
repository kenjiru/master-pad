package app;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import calc.Calculator;
import calc.CalculatorHelper;

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
			c.run();
		}
		
		if (args[0].equals("-server")) {
			if (args.length != 3) {
				Main.usage();
				return;
			}
			
			Server s = new Server(args[1], args[2]);
			s.run();
		}
	}
	
	public static void usage() {
		System.out.println("Utilizare: ");
		System.out.println("\t java app1.Main -client <hostName> <portNumber> <numeObiect>");
		System.out.println("\t java app1.Main -server <hostName> <portNumber>");

	}
}

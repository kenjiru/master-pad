package app;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.*;
import java.rmi.registry.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client 
{
	private Interfata interfata;
	private String hostName;
	private int port;
	private String numeInterfata;
	
	public Client(String hostName, String port, String numeInterfata) {
		this.hostName = hostName;
		this.port = Integer.parseInt(port);
		this.numeInterfata = numeInterfata;
	}
	
	private void init() {
        Registry registry;
		try {
			registry = LocateRegistry.getRegistry(hostName, port);
			
			interfata = (Interfata) registry.lookup(numeInterfata);
		} catch (RemoteException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void run() throws IOException {
		int steps, threads;
		
		init();
		
		Scanner in = new Scanner(System.in);  
		
		System.out.println("Steps: ");
		steps = in.nextInt();
		System.out.println("Threads: ");
		threads = in.nextInt();
		
		System.out.println("PI: " + interfata.PI(threads, steps));
	}
}

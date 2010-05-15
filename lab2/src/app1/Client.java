package app1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.*;
import java.rmi.registry.*;
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
		} catch (RemoteException e) {
			e.printStackTrace();
			return;
		}

		try {
			interfata = (Interfata) registry.lookup(numeInterfata);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
	
	private void calculeaza(String a, String b, String o) {
		long x = Long.parseLong(a);
		long y = Long.parseLong(b);
		long z = 0;
		
		char c = o.charAt(0);

		try {
			switch (c) {
			case '+':
				z = interfata.aduna(x, y);
				break;
			case '-':
				z = interfata.scade(x, y);
				break;
			case '*':
				z = interfata.inmulteste(x, y);
				break;
			case '/':
				z = interfata.imparte(x, y);
				break;
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		System.out.println("Rezultat: " + Long.toString(z));
	}
	
	public void run() {
		init();
		
		System.out.println("Introduceti operatia de forma ");
		System.out.println("a [+,-,*,/] b <enter>");
		
		while (true) {
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				String line = reader.readLine();
				
				Pattern p = Pattern.compile("(\\d*)\\s*([+,-,*,/])\\s*(\\d*)\\s*[=]*\\s*");
				Matcher m = p.matcher(line);
				
				if (m.matches() == false) {
					System.out.println("Nu a-ti introdus o expresie valida!");
				}
				
				calculeaza(m.group(1), m.group(3), m.group(2));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]) {
        new Client("localhost", "5000", "Interfata").run();
    }
}

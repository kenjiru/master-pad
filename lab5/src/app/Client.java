package app;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import calc.*;

public class Client 
{
	private Calculator calculatorImpl;
	private String host;
	private String port;
	private String numeObiect;
	
	public Client(String host, String port, String numeObiect) {
		this.host = host;
		this.port = port;
		this.numeObiect = numeObiect;
	}
	
	private void init() {
		try {
			String[] args = null;
    		
    		Properties props = new Properties();
            props.put("org.omg.CORBA.ORBInitialPort", port);
            props.put("org.omg.CORBA.ORBInitialHost", host);
            
			ORB orb = ORB.init(args, props);

			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			calculatorImpl = CalculatorHelper.narrow(ncRef.resolve_str(numeObiect));
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
	
	private void calculeaza(String a, String b, String o) {
		long x = 0, y = 0, z = 0;
		String s = null;
		
		if (a.length() > 0)
			x = Long.parseLong(a);
		
		if (b.length() > 0)
			y = Long.parseLong(b);
		
		char c = o.charAt(0);

		try {
			switch (c) {
			case '+':
				z = calculatorImpl.aduna(x, y);
				break;
			case '-':
				z = calculatorImpl.scade(x, y);
				break;
			case '*':
				z = calculatorImpl.inmulteste(x, y);
				break;
			case '/':
				z = calculatorImpl.imparte(x, y);
				break;
			case '^':
				s = calculatorImpl.baza2(x);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		if (s != null)
			System.out.println("Rezultat: " + s);
		else
			System.out.println("Rezultat: " + Long.toString(z));
	}
	
	public void run() {
		init();
		
		System.out.println("Introduceti operatia de forma ");
		System.out.println("a [+,-,*,/,^] b <enter>");
		
		while (true) {
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				String line = reader.readLine();
				
				Pattern p = Pattern.compile("(\\d*)\\s*([+,\\-,*,/,^])\\s*(\\d*)\\s*[=]*\\s*");
				Matcher m = p.matcher(line);
				
				if (m.matches()) {
					calculeaza(m.group(1), m.group(3), m.group(2));
				} else {
					System.out.println("Nu a-ti introdus o expresie valida!");
				}
				
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}
}

package app;

import java.util.Properties;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import calc.Calculator;
import calc.CalculatorHelper;

public class Server {
	private String host;
	private String port;
	
	public Server(String host, String port) {
		this.host = host;
		this.port = port;
	}
	
    public void run() 
    {
    	try {
    		String[] args = null;
    		
    		Properties props = new Properties();
            props.put("org.omg.CORBA.ORBInitialPort", port);
            props.put("org.omg.CORBA.ORBInitialHost", host);
            
			ORB orb = ORB.init(args, props);

			POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();

			CalculatorImpl calculatorImpl = new CalculatorImpl();

			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(calculatorImpl);
			Calculator href = CalculatorHelper.narrow(ref);
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			NameComponent path[] = ncRef.to_name("Calculator");
			ncRef.rebind(path, href);
			
			System.out.println("Serverul este pregatit...");

			orb.run();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		System.out.println("Serverul termina ...");
    }
}

package app;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class Server implements Interfata {
	private int port;
	private String interfata = "Interfata";
	
	public Server(String port) {
		this.port = Integer.parseInt(port);
	}
	
	public double PI(int threads, int steps) throws RemoteException {
		return NativePI.PI(steps, threads);
	}

    public void run() 
    {
        try {
            Interfata stub = (Interfata) UnicastRemoteObject.exportObject(this, 0);
       
            Registry registry = LocateRegistry.createRegistry(port);
            registry.rebind(interfata, stub);
            
            System.out.println("Obiectul server a fost inregistrat!");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}

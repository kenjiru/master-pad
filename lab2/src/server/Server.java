package server;
import interfata.Interfata;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Interfata {

	public long aduna(long a, long b) throws RemoteException {
        return a + b;
    }

    public long scade(long a, long b) throws RemoteException {
        return a - b;
    }

    public long inmulteste(long a, long b) throws RemoteException {
        return a * b;
    }

    public long imparte(long a, long b) throws RemoteException {
        return a / b;
    }

    public static void main(String[] args) 
    {
    	if (System.getSecurityManager() == null) {
        	RMISecurityManager rmiSM = new RMISecurityManager();
        	System.setSecurityManager(rmiSM);
        }
    	
        try {
            Interfata interfata = new Server();
            Interfata stub = (Interfata) UnicastRemoteObject.exportObject(interfata, 0);
       
            String nume = "Interfata";
            int port = 5000;
            Registry registry = LocateRegistry.createRegistry(port);
            registry.rebind(nume, stub);
            
            System.out.println("Obiectul server a fost inregistrat!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

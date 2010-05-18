package app;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interfata extends Remote {

	long aduna(long a, long b) throws RemoteException;

    long scade(long a, long b) throws RemoteException;

    long inmulteste(long a, long b) throws RemoteException;

    long imparte(long a, long b) throws RemoteException;
}


import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.SortedMap;
import java.util.TreeMap;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class NamingServer
{

    static SortedMap<Integer, String> sm = new TreeMap<Integer, String>();

    public static void main(String[] args) throws UnknownHostException, MalformedURLException {
        System.out.print("Naming Server (code written by group 6)\n");

        try{
            NamingServerExecute namingServerExecute = new NamingServerExecute();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/NamingServerInterface", namingServerExecute);
            System.out.println("Server is running...");

        }catch(RemoteException e){
            System.out.println("Error: " + e.getMessage());
            //PLEASE WORK PLEASE -- Monba 2017
        }
    }
}
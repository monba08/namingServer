import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class NamingServerExecute extends UnicastRemoteObject implements NamingServerInterface
{
    public NamingServerExecute() throws RemoteException
    {
        super();
    }

    public String printNodes()
    {
        return null;
    }
}
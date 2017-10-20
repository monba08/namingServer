import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NamingServerInterface extends Remote
{
    public String printNodes() throws RemoteException;
}

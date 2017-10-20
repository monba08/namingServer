import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class NamingServer
{
    static String filename;
    static SortedMap<Integer, String> sm = new TreeMap<Integer, String>();

    public static void main(String[] args) throws UnknownHostException {
        System.out.print("Naming Server (code written by group 6)\n");

        // Give an address
        String address = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Server Address: ");
        address = sc.nextLine();

        InetAddress ip = InetAddress.getByName(address);

        //int hashFileName = Math.abs(filename.hashCode() % 32768);

    }
}
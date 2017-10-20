import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class NamingServer
{
    static String filename;
    static SortedMap<Integer, String> sm = new TreeMap<Integer, String>();

    public static void main(String[] args)
    {
        System.out.print("Naming (code written by Stefan Djordjevski & Yunus Emre Yigit)\n");

        // Ask which Server the client wants to connect too
        String address = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Server Address: ");
        address = sc.nextLine();

        int hashFileName = Math.abs(filename.hashCode() % 32768);
    }
}
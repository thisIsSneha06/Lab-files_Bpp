package Assignment5_11500119052;
import java.util.*;
import java.net.*;

class Sender {
    public static void main(String[] agrs) throws Exception {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("225.0.0.4");
        MulticastSocket ms = new MulticastSocket(4002);
        System.out.println("Enter your cast message: ");
        String msg = sc.nextLine();
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), ip, 4002);
        ds.send(dp);
        sc.close();
        ms.close();
        ds.close();
    }
}

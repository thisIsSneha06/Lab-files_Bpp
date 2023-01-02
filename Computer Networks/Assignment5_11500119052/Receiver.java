package Assignment5_11500119052;
import java.net.*;

class Receiver {
    public static void main(String[] args) throws Exception {
        InetAddress mcastaddr = InetAddress.getByName("225.0.0.4");
        NetworkInterface netIf = NetworkInterface.getByName("bge0");
        MulticastSocket ms = new MulticastSocket(4002);

        ms.joinGroup(new InetSocketAddress(mcastaddr, 0), netIf);
        byte[] b = new byte[1200];
        DatagramPacket dp = new DatagramPacket(b, b.length);
        ms.receive(dp);
        String str = new String(dp.getData());
        System.out.println("Cast message: " + str);
        ms.close();
    }
}

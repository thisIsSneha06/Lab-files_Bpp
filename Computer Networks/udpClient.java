import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class udpClient {
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		DatagramSocket ds = new DatagramSocket();
		InetAddress ip = InetAddress.getLocalHost();
		byte buf[] = null;
		byte buf2[] = null;
		
		System.out.println("Enter text: ");
        while (true)
        {
            String inp = sc.nextLine();
            buf2 = inp.getBytes();
            DatagramPacket DpSend = new DatagramPacket(buf2, buf2.length, ip, 1234);
            ds.send(DpSend);
			if (inp.equals("Goodbye"))
				break;

			System.out.print("Enter the equation in the format:");
			System.out.println("'operand1 operator operand2'");
			inp = sc.nextLine();
			buf = new byte[65535];
			buf = inp.getBytes();
			DatagramPacket DpSend2 = new DatagramPacket(buf, buf.length, ip, 5678);
			ds.send(DpSend2);
			buf = new byte[65535];
			DatagramPacket DpReceive = new DatagramPacket(buf, buf.length);
			ds.receive(DpReceive);
			System.out.println("Answer: " + new String(buf, 0, buf.length));
		}
        sc.close();
        ds.close();
	}
}

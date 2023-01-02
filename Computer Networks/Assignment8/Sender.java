package Assignment8;
import java.io.*;
import java.net.*;
import java.util.*;

public class Sender{
	public static void main(String args[]) throws Exception{
		Sender sws = new Sender();
		sws.run();
	}
	public void run() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of frames to be sent: ");
		int n=sc.nextInt();
		Socket myskt = new Socket("localhost",4444);
		PrintStream myps = new PrintStream(myskt.getOutputStream());
		for(int i=0;i<=n;){
			if(i==n){
				myps.println("exit");
				break;
			}
			System.out.println("Frame no. "+ i +" has been sent.");
			myps.println(i);

			BufferedReader bf = new BufferedReader(new InputStreamReader(myskt.getInputStream()));
			String ack = bf.readLine();
			if(ack!=null){
				System.out.println("Acknowledgement Received!\n");
				i++;
				Thread.sleep(4000);
			}
			else{
				myps.println(i);
			}
		}
        myskt.close();
        sc.close();
	}
}
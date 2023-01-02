import java.io.IOException;  
import java.io.PrintStream;  
import java.net.Socket;  
import java.net.UnknownHostException;  
import java.util.Scanner;  
public class myChatClient {  
public static void main(String arg[]) throws UnknownHostException,IOException  
{  
    String number,temp;  
    Scanner sc = new Scanner(System.in);  
    Socket s=new Socket("127.0.0.1",1408);  
    Scanner sc1=new Scanner(s.getInputStream());  
    System.out.println("Send any message: ");  
    number=sc.nextLine();  
    PrintStream p=new PrintStream(s.getOutputStream());  
    p.println(number);  
    temp=sc1.nextLine();  
    System.out.println("Message sent by Server: "+temp);   
    s.close();  
    sc.close();
  }  
}  
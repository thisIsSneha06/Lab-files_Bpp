import java.io.IOException;  
import java.io.PrintStream;  
import java.net.ServerSocket;  
import java.net.Socket;  
import java.util.Scanner;  
  
public class myChatServer {  
    public static void main(String[] args) throws IOException {  
        String str;  
        ServerSocket s1=new ServerSocket(1408);  
        Socket ss=s1.accept();  
        Scanner sc=new Scanner(ss.getInputStream());  
        str=sc.nextLine();  
        PrintStream p=new PrintStream(ss.getOutputStream());  
        p.println("Hello client!");  
        System.out.println("Message send by client: "+str);  
        if(!ss.isClosed())  
        {  
        s1.close();  
        System.out.println("Server closed.");  
        }  
    }  
}  
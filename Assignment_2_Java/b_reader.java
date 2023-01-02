package com.company;
import java.io.*;
public class b_reader {
    public static void main(String[] args)throws Exception {
        System.out.println("Enter password to access file: ");
        //using BufferedReader to take input by InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //password is 12345
        if (n==12345)
            System.out.printf("Password: %d is correct!\nAccessing file...\n\n",n);
        else
            System.out.println("Wrong password");

        FileReader fr = new FileReader("C:\\Users\\sneha\\OneDrive\\Desktop\\test.txt");
        //using BufferedReader to read a test.txt file
        BufferedReader br2 = new BufferedReader(fr);
        int i;
        while((i=br2.read())!=-1)
            System.out.print((char)i);
        br.close();
        br2.close();
        fr.close();
    }
}

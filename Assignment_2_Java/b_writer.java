package com.company;
import java.io.*;
public class b_writer {
    public static void main(String[] args)throws Exception {
        FileWriter fw = new FileWriter("C:\\Users\\sneha\\OneDrive\\Desktop\\test2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        //writing in file
        bw.write("This is First Line.");
        bw.newLine();
        bw.write("This is Second line.");
        bw.newLine();
        bw.write("This is Third line.");
        bw.newLine();
        bw.close();
        fw.close();

        FileReader fr = new FileReader("C:\\Users\\sneha\\OneDrive\\Desktop\\test2.txt");
        BufferedReader br = new BufferedReader(fr);
        //reading the file
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        br.close();
        fr.close();
    }
}

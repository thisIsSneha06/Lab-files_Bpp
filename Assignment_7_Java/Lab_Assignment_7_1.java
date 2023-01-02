package com.company;

interface Contacts{     // interface A
    String[] fetchNetworks();
}

interface Camera{       // interface B
    void takeSnap();
    void recordVideo();
    public default void start(){
        System.out.println("\nStart shooting...");
    }

    public default void startHDVideo(){
        start();
        System.out.println("Recording view in HD...");
    }
}

abstract class CellPhone{      // Abstract class C
    void callNumber(long phn){
        System.out.println("\nCalling "+phn+"...");
    }
    void pickCall(){
        System.out.println("Connecting to user... \nPicking up...");
    }
}

class SmartPhone extends CellPhone implements Contacts, Camera{   // class D
    public void takeSnap(){
        System.out.println("Taking snap...");
    }
    public void recordVideo(){
        System.out.println("Recording Video...");
    }
    public String[] fetchNetworks(){
        System.out.println("\nGetting list of networks... ");
        String[] networkList = {"Mom", "Friend1", "Friend2", "Work", "Home"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Dial to "+network+"...");
    }
}

public class Lab_Assignment_7_1{
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();   // Class smartphone has numerous features, like that of a cellphone, a camera, and a contact directory
        // using Dynamic method dispatch to use Smartphone in multiple ways

        CellPhone cp = new SmartPhone();    // Smartphone is being used as a Cellphone to make calls
        Camera c = new SmartPhone();      // smartphone is being used to use Camera interface
        Contacts con = new SmartPhone();    // smartphone is being used to use the contacts interface and find people

        c.takeSnap();           // using methods in Camera
        c.recordVideo();
        c.startHDVideo();

        con.fetchNetworks();     // method in interface Contacts is called but doesn't return anything

        sp.fetchNetworks();    // abstract method in interface Contacts can be called by class implementing it
        sp.connectToNetwork("Mom");    // extra method in class Smartphone

        cp.callNumber(986571023);     // using cellphone methods
        cp.pickCall();
    }
}

package com.company;

import javax.naming.ldap.SortKey;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(3434);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        Scanner input = new Scanner(System.in);
        System.out.println("someone is accepted");
        String s1 = "", s2 = "";
        s1 = din.readUTF();
        System.out.println("server name is "+s1);

    }
}

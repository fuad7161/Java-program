package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)throws IOException {
        Socket s = new Socket("127.0.0.1", 3434);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        Scanner input = new Scanner(System.in);
        String s1 = "",s2 = "";
        s1 = input.nextLine();
        dout.writeUTF(s1);
    }
}

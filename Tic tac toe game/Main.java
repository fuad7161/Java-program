package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new frame();
    }
}

class frame extends JFrame implements ActionListener {
    Boolean win = false;
    int take = 0;
    //Image
    ImageIcon img1 = new ImageIcon("picture\\cross.png");
    ImageIcon img2 = new ImageIcon("picture\\zero.png");
    //array of the game
    int[] a = new int[11];
    //button
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,restarbutton;
    //turn
    Boolean z = Boolean.FALSE;
    //lebel
    JLabel l1,l2,l3;
    //start from here
    public frame(){
        //basic setup
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int xframe = 500,yframe = 500;
        setBounds(500,50,xframe,yframe);
        setLayout(null);
        button();
        lebel();
    }

    public void button(){
        //initializing button
        b1 = new JButton();b2 = new JButton();b3 = new JButton();
        b4 = new JButton();b5 = new JButton();b6 = new JButton();
        b7 = new JButton();b8 = new JButton();b9 = new JButton();
        restarbutton = new JButton("Restart");
        //set buttion bount
        int x = 10,y = 50;
        b1.setBounds(x+10,y+10,100,100);
        b2.setBounds(x+110,y+10,100,100);
        b3.setBounds(x+210,y+10,100,100);
        b4.setBounds(x+10,y+110,100,100);
        b5.setBounds(x+110,y+110,100,100);
        b6.setBounds(x+210,y+110,100,100);
        b7.setBounds(x+10,y+210,100,100);
        b8.setBounds(x+110,y+210,100,100);
        b9.setBounds(x+210,y+210,100,100);
        restarbutton.setBounds(330,110,100,50);
        //add all button
        add(b1);add(b2);add(b3);add(b4);add(b5);
        add(b6);add(b7);add(b8);add(b9);add(restarbutton);
        //add to the action listener
        b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
        b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
        b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);
        restarbutton.addActionListener(this);
    }

    public void lebel(){
        l1 = new JLabel("1st Player's turn");
        l2 = new JLabel("");
        l3 = new JLabel("");
        int xlebel = 10,ylebel = 15;
        l1.setBounds(xlebel + 10,ylebel +10,130,15);
        l2.setBounds(xlebel + 150,ylebel +10,130,15);
        l3.setBounds(xlebel+10,ylebel+350,200,20);
        add(l1);
        add(l2);
        add(l3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == restarbutton){
            dispose();
            new frame();
        }

        if(win == false){
            Boolean successfulMove = Boolean.TRUE;
            if(e.getSource() == b1){
                if(a[1] == 0){
                    if(z == Boolean.FALSE) {
                        a[1] = 1;
                        b1.setIcon(img1);
                    }
                    else{
                        a[1] = 2;
                        b1.setIcon(img2);
                    }
                }else {
                    successfulMove = Boolean.FALSE;
                }
            }else if(e.getSource() == b2){
                if(a[2] == 0){
                    if(z == Boolean.FALSE){
                        a[2] = 1;
                        b2.setIcon(img1);
                    }
                    else{
                        a[2] = 2;
                        b2.setIcon(img2);
                    }
                }else {
                    successfulMove = Boolean.FALSE;
                }
            }else if(e.getSource() == b3){
                if(a[3] == 0){
                    if(z == Boolean.FALSE){
                        a[3] = 1;
                        b3.setIcon(img1);
                    }
                    else{
                        a[3] = 2;
                        b3.setIcon(img2);
                    }
                }else {
                    successfulMove = Boolean.FALSE;
                }
            }else if(e.getSource() == b4){
                if(a[4] == 0){
                    if(z == Boolean.FALSE){
                        a[4] = 1;
                        b4.setIcon(img1);
                    }
                    else{
                        a[4] = 2;
                        b4.setIcon(img2);
                    }
                }else {
                    successfulMove = Boolean.FALSE;
                }
            }else if(e.getSource() == b5){
                if(a[5] == 0){
                    if(z == Boolean.FALSE){
                        a[5] = 1;
                        b5.setIcon(img1);
                    }
                    else{
                        a[5] = 2;
                        b5.setIcon(img2);
                    }
                }else{
                    successfulMove = Boolean.FALSE;
                }
            }else if(e.getSource() == b6){
                if(a[6] == 0){
                    if(z == Boolean.FALSE){
                        a[6] = 1;
                        b6.setIcon(img1);
                    }
                    else{
                        a[6] = 2;
                        b6.setIcon(img2);
                    }
                }else{
                    successfulMove = Boolean.FALSE;
                }
            }else if(e.getSource() == b7){
                if(a[7] == 0){
                    if(z == Boolean.FALSE){
                        a[7] = 1;
                        b7.setIcon(img1);
                    }
                    else {
                        a[7] = 2;
                        b7.setIcon(img2);
                    }
                }else{
                    successfulMove = Boolean.FALSE;
                }
            }else if(e.getSource() == b8){
                if(a[8] == 0){
                    if(z == Boolean.FALSE){
                        a[8] = 1;
                        b8.setIcon(img1);
                    }
                    else{
                        a[8] = 2;
                        b8.setIcon(img2);
                    }
                }else{
                    successfulMove = Boolean.FALSE;
                }
            }else if(e.getSource() == b9){
                if(a[9] == 0){
                    if(z == Boolean.FALSE){
                        a[9] = 1;
                        b9.setIcon(img1);
                    }
                    else{
                        a[9] = 2;
                        b9.setIcon(img2);
                    }
                }else{
                    successfulMove = Boolean.FALSE;
                }
            }
            if(successfulMove == Boolean.TRUE){
                if(z == Boolean.FALSE){
                    z = Boolean.TRUE;
                    l1.setText("2nd Player's turn");
                }else{
                    z = Boolean.FALSE;
                    l1.setText("1st Player's turn");
                }
                l2.setText("");
            }else{
                l2.setText("already taken");
            }
            if(a[1] !=0 && a[1] == a[2] && a[1] == a[3]){
                take = a[1];
                win = true;
            }else if(a[4] !=0 && a[4] == a[5] && a[4] == a[6]){
                take = a[4];
                win = true;
            }else if(a[7] !=0 && a[7] == a[8] && a[7] == a[9]){
                take = a[7];
                win = true;
            }else if(a[1] !=0 && a[1] == a[4] && a[4] == a[7]){
                take = a[1];
                win = true;
            }else if(a[2] !=0 && a[2] == a[5] && a[5] == a[8]){
                take = a[2];
                win = true;
            }else if(a[3] !=0 && a[3] == a[6] && a[6] == a[9]){
                take = a[3];
                win = true;
            }else if(a[1] !=0 && a[1] == a[5] && a[5] == a[9]){
                take = a[1];
                win = true;
            }else if(a[3] !=0 && a[3] == a[5] && a[5] == a[7]){
                take = a[3];
                win = true;
            }
            if(win == true){
                if(take == 1){
                    //System.out.println("player one is win the game");
                    l3.setText("player one is win the game");
                }
                else{
                    //System.out.println("player two is win the game");
                    l3.setText("player two is win the game");
                }
            }else{
                int taken = 0;
                for(int i=1;i<10;i++){
                    if(a[i] != 0){
                        taken++;
                    }
                }
                if(taken == 9){
                    l3.setText("Game is Tie");
                }
            }
        }else{
            l3.setText("game is already finished");
        }
    }
}

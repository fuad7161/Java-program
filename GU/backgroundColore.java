import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class backgroundColore {
    public static void main(String[] args) {
        new frame4();
    }
}

class frame4 extends JFrame{
    JButton button1,button2,button3;
    Container con;
    public frame4(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,50,500,300);
        setLayout(null);
        button1 = new JButton("red");
        button2 = new JButton("green");
        button3 = new JButton("blue");
        button1.setBounds(10,10,70,30);
        button2.setBounds(90,10,70,30);
        button3.setBounds(170,10,70,30);
        add(button1);
        add(button2);
        add(button3);
        con = getContentPane();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con.setBackground(Color.red);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con.setBackground(Color.green);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con.setBackground(Color.blue);
            }
        });
    }
}

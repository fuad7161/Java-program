import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class backgroundColoreImplement {
    public static void main(String[] args) {
        new frame5();
    }
}

class frame5 extends JFrame implements ActionListener {
    JButton button1,button2,button3;
    Container con = new Container();
    public frame5(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,50,500,300);
        setLayout(null);
        button1 = new JButton("Red");
        button2 = new JButton("green");
        button3 = new JButton("blue");
        button1.setBounds(10,10,70,30);
        button2.setBounds(90,10,70, 30);
        button3.setBounds(170,10,70,30);
        add(button1);
        add(button2);
        add(button3);
        con = getContentPane();
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            con.setBackground(Color.red);
        }
        if(e.getSource() == button2){
            con.setBackground(Color.green);
        }
        if(e.getSource() == button3){
            con.setBackground(Color.blue);
        }
    }
}

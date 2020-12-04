import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadiobutton {
    public static void main(String[] args) {
        new frame8();
    }
}
class frame8 extends JFrame implements ActionListener {
    JRadioButton b1,b2,b3,b4,b5;
    JLabel l1,l2;
    ButtonGroup bg1,bg2;
    public frame8(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,50,500,400);
        setLayout(null);
        b1 = new JRadioButton("Football");
        b2 = new JRadioButton("Cricket");
        b3 = new JRadioButton("Rugby");

        b4 = new JRadioButton("Boy");
        b5 = new JRadioButton("Girl");

        l1 = new JLabel("I don't love to play");
        l2 = new JLabel("I am nobody");

        b1.setBounds(10,10,400,40);
        b2.setBounds(10,50,400,40);
        b3.setBounds(10,90,400,40);
        b4.setBounds(10,150,400,40);
        b5.setBounds(10,190,400,40);

        l1.setBounds(10,250,400,40);
        l2.setBounds(10,300,400,40);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(l1);
        add(l2);
        bg1 = new ButtonGroup();
        bg2 = new ButtonGroup();

        bg1.add(b1);
        bg1.add(b2);
        bg1.add(b3);

        bg2.add(b4);
        bg2.add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            l1.setText("I love to play Football");
        }if(e.getSource() == b2){
            l1.setText("I love to play Cricket");
        }if(e.getSource() == b3){
            l1.setText("I love to play Rugby");
        }if(e.getSource() == b4){
            l2.setText("I am a  Boy");
        }if(e.getSource() == b5){
            l2.setText("I am a Girl");
        }
    }
}


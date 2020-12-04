import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class image {
    public static void main(String[] args) {
        new frame();
    }
}

class frame extends JFrame implements ActionListener {
    JLabel l1;
    ImageIcon img1 = new ImageIcon("src\\cross.png");
    ImageIcon img2 = new ImageIcon("src\\zero.png");
    JButton b1,b2;
    public frame(){
        super("love you sanjana");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,50,500,300);
        setLayout(null);
        //l1 = new JLabel(img);
        b1 = new JButton();
        b1.setBounds(10,10,100,100);
        b2 = new JButton();
        b2.setBounds(120,10,100,100);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            b1.setIcon(img1);
        }
        if(e.getSource() == b2){
            b2.setIcon(img2);
        }
    }
}

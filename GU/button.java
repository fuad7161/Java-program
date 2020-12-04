import javax.swing.*;
import java.awt.*;

public class button {
    public static void main(String[] args) {
        new frame2();
    }
}

class frame2 extends JFrame{
    JButton button;
    JLabel label;
    public frame2(){
        super("button");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,50,500,300);
        setLayout(null);
        button = new JButton("click");
        label = new JLabel("click the button");
        add(button);
        add(label);
        button.setBounds(10,10,100,30);
        label.setBounds(10,40,100,30);
        button.setForeground(Color.blue);
        button.setBackground(Color.WHITE);
        button.setOpaque(true);
        Font font = new Font("Arial",Font.BOLD,20);
        button.setFont(font);
    }
}

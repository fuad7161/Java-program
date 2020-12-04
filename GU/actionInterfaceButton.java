import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionInterfaceButton {
    public static void main(String[] args) {
        new frame3();
    }
}

class frame3 extends JFrame{
    JButton button;
    public frame3(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,50,500,300);
        button = new JButton("love");
        setLayout(null);
        button.setBounds(10,10,70,30);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello world");
            }
        });
    }
}

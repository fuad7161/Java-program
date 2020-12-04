import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jtextfil {
    public static void main(String[] args) {
        new frame6();
    }
}
class frame6 extends JFrame {
    JTextField f1,f2;
    JButton button;
    public frame6(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 50, 500, 300);
        setLayout(null);
        f1 = new JTextField();
        f1.setBounds(10,10,200,100);
        add(f1);
        button = new JButton("submit");
        button.setBounds(10,120,80,30);
        add(button);
        f2 = new JTextField();
        f2.setBounds(220,10,200,100);
        add(f2);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = f1.getText();
                f2.setText(input);
            }
        });
    }
}

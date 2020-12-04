import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    public static void main(String[] args) {
        new frame1();
    }
}
class frame1 extends JFrame implements ActionListener {
    JLabel l1;
    JLabel heading,result,check;
    ImageIcon img;
    //button
    JButton find,Submit;
    //textFild
    JTextField TextHere;
    //text area
    JTextArea text;
    //redio Button
    JRadioButton b1,b2,b3,b4,b5;
    public frame1(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(null);
        heading = new JLabel("write something here: ");
        check = new JLabel("what you have done today?");
        heading.setBounds(10,5,400,30);
        check.setBounds(10,205,400,30);
        add(heading);
        add(check);
        setBounds(500,50,520,410);
        img = new ImageIcon("C:\\Users\\DOLPHIN\\Pictures\\my pic\\fb\\bool2.jpg");
        l1 = new JLabel(img);
        add(l1);
        //Button
        Submit = new JButton("Submit");
        Submit.setBounds(320,40,100,30);
        add(Submit);
        find = new JButton("Check your results.");
        find.setBounds(10,240,400,30);
        add(find);
        Submit.addActionListener(this);
        find.addActionListener(this);
        //TextFild
        TextHere = new JTextField();
        TextHere.setBounds(10,40,300,30);
        add(TextHere);
        //text area
        text = new JTextArea();
        text.setBounds(10,280,400,100);
        add(text);
        //RadioButton
        b1 = new JRadioButton();
        b1.setBounds(10,75,400,30);
        b2 = new JRadioButton();
        b2.setBounds(10,110,400,30);
        b3 = new JRadioButton();
        b3.setBounds(10,145,400,30);
        b4 = new JRadioButton();
        b4.setBounds(10,180,400,30);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        //pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

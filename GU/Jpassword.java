import javax.swing.*;
import java.awt.*;

public class Jpassword {
    public static void main(String[] args) {
        new frame7();
    }
}

class frame7 extends JFrame{
    JPasswordField psw;
   public frame7(){
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(500, 50, 500, 300);
       setLayout(null);
       psw = new JPasswordField();
       psw.setBounds(10,10,200,100);
       add(psw);
   }
}

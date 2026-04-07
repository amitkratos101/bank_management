package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Signup3 extends JFrame {
    Signup3(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        setSize(850,800);
        setLayout(null);
    }
    public static void main(String[] args) {
        new Signup3();
    }
}

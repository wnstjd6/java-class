package day04;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx  extends JFrame {
    public BorderLayoutEx(){
        setTitle("BorderLayout 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new BorderLayout(30,20));
        c.add(new JButton("Calculate"), BorderLayout.CENTER);
        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("sub"), BorderLayout.SOUTH);
        c.add(new JButton("mul"), BorderLayout.EAST);
        c.add(new JButton("div"),BorderLayout.WEST);

        setSize(300,200);
        setVisible(true);


    }
    public static void main(String[] args){
    new BorderLayoutEx();
    }
}

package day04;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx(){
        setTitle("FlowLayout 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
            c.add(new JButton("add"));
            c.add(new JButton("sub"));
            c.add(new JButton("mul"));
            c.add(new JButton("div"));
            c.add(new JButton("Calculate"));
            setSize(300,200);
            setVisible(true);

    }
    public static void main(String[] args){
        new FlowLayoutEx();
    }
}

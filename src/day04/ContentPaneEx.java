package day04;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx(){
        setTitle("ContentPane과 JFeame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

       Container container  = getContentPane();
      container.setBackground(Color.ORANGE);
        setLocationRelativeTo(null);
      container.setLayout(new FlowLayout());
      container.add(new JButton("OK"));
      container.add(new JButton("Cancel"));
      container.add(new JButton("lgnore"));

        setSize(300,150);
        setVisible(true);

    }
    public static void main(String[] args){
        new ContentPaneEx();
    }
}

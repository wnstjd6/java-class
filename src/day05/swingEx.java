package day05;

import javax.swing.*;
import java.awt.*;

public class swingEx extends JFrame {
    public swingEx(){
        setTitle("도서관리 시스템");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,400);
        setLocationRelativeTo(null);
        Container c=  getContentPane();
        c.setLayout(new FlowLayout());

        setVisible(true);
    }
    public static void main(String[] args){
        new swingEx();
    }
}

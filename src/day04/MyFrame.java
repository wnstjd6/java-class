package day04;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        MyFrame myFrame = new MyFrame();

    }
}

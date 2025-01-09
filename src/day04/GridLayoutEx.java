package day04;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx(){
        setTitle("GridLayout 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        GridLayout gridLayout = new GridLayout(4,2); //행 , 열
        gridLayout.setVgap(5); //필드 사이를 5 크기로 띄우겠다.

        Container c = getContentPane();

        c.setLayout(gridLayout); // 내가 만든 레이아웃 화면에 집어 넣기
        c.add(new JLabel("이름"));
        c.add(new JTextField(""));
        c.add(new JLabel("학번"));
        c.add(new JTextField(""));
        c.add(new JLabel("학과"));
        c.add(new JTextField(""));
        c.add(new JLabel("과목"));
        c.add(new JTextField(""));

        setSize(300,200);
        setVisible(true);

    }
    public static void main(String[] args){
    new GridLayoutEx();
    }
}

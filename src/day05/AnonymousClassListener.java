package day05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AnonymousClassListener extends JFrame {
    public AnonymousClassListener() {
        setTitle("익명 클래스 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        c.add(btn);

        btn.addActionListener(new AbstractAction() {//익명클래스 로 Action 리스너 작성

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                if (b.getText().equals("Action")) {
                    b.setText("액션");
                } else
                    b.setText("Action");
                setTitle(b.getText());
            }
        });
        setSize(350, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new AnonymousClassListener();
    }
}

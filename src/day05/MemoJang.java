package day05;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

// 메모장 애플리케이션 클래스 정의
public class MemoJang extends JFrame {
    private JTextArea textArea; // 텍스트를 입력받는 영역

    // 생성자: 메모장 GUI를 초기화
    public MemoJang() {
        setTitle("메모장"); // 창 제목 설정
        setSize(400, 300); // 창 크기 설정
        setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기 버튼 동작 설정
        setLocationRelativeTo(null); // 창을 화면 중앙에 배치

        // 텍스트 입력 영역 생성 및 스크롤 지원
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER); // 스크롤 가능하도록 JScrollPane에 추가

        // 메뉴바 생성
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("파일"); // 파일 메뉴 생성

        // "저장" 및 "열기" 메뉴 항목 생성
        JMenuItem save = new JMenuItem("저장");
        JMenuItem open = new JMenuItem("열기");

        // "저장" 및 "열기" 메뉴 항목에 동작 추가
        save.addActionListener(new SaveFileAction()); // 파일 저장 동작 연결
        open.addActionListener(new OpenFileAction()); // 파일 열기 동작 연결

        // 단축키 설정 (Ctrl+S, Ctrl+O)
        save.setAccelerator(KeyStroke.getKeyStroke('S', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        open.setAccelerator(KeyStroke.getKeyStroke('O', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));

        // 메뉴 항목을 파일 메뉴에 추가
        fileMenu.add(open);
        fileMenu.add(save);

        // 파일 메뉴를 메뉴바에 추가
        menuBar.add(fileMenu);

        // 메뉴바를 JFrame에 추가
        setJMenuBar(menuBar);
    }

    // 내부 클래스: 파일 저장 기능 구현
    private class SaveFileAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser(); // 파일 선택기 생성
            if (fileChooser.showSaveDialog(MemoJang.this) == JFileChooser.APPROVE_OPTION) { // 파일 저장 대화상자 표시
                File file = fileChooser.getSelectedFile(); // 사용자가 선택한 파일 가져오기
                try (PrintWriter writer = new PrintWriter(file)) { // 파일 쓰기 스트림 생성
                    writer.write(textArea.getText()); // 텍스트 영역의 내용을 파일에 저장
                } catch (IOException ex) { // 예외 처리
                    JOptionPane.showMessageDialog(MemoJang.this, "파일 저장 중 오류 발생: " + ex.getMessage(),
                            "오류", JOptionPane.ERROR_MESSAGE); // 오류 메시지 출력
                }
            }
        }
    }

    // 내부 클래스: 파일 열기 기능 구현
    private class OpenFileAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser(); // 파일 선택기 생성
            if (fileChooser.showOpenDialog(MemoJang.this) == JFileChooser.APPROVE_OPTION) { // 파일 열기 대화상자 표시
                File file = fileChooser.getSelectedFile(); // 사용자가 선택한 파일 가져오기
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) { // 파일 읽기 스트림 생성
                    textArea.setText(""); // 텍스트 영역 초기화
                    String line;
                    while ((line = reader.readLine()) != null) { // 파일에서 한 줄씩 읽기
                        textArea.append(line + "\n"); // 텍스트 영역에 읽은 내용 추가
                    }
                } catch (IOException ex) { // 예외 처리
                    JOptionPane.showMessageDialog(MemoJang.this, "파일 열기 중 오류 발생: " + ex.getMessage(),
                            "오류", JOptionPane.ERROR_MESSAGE); // 오류 메시지 출력
                }
            }
        }
    }

    // 애플리케이션 시작점 (main 메서드)
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { // Event Dispatch Thread에서 실행
            MemoJang notepad = new MemoJang(); // 메모장 인스턴스 생성
            notepad.setVisible(true); // 창 표시
        });
    }
}

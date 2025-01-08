package day03;
import java.util.HashMap;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> h = new HashMap<>(); // 회원 정보를 저장할 HashMap
        while (true) {
            System.out.print("회원가입/로그인 (h/n) 종료(x): ");
            String choice = sc.next();

            if (choice.equals("h")) { // 회원가입 로직
                System.out.println("======= 회원가입 =======");
                System.out.print("id: ");
                String id = sc.next();
                if (h.containsKey(id)) {
                    System.out.println("이미 존재하는 id입니다. 다른 id를 입력하세요.");
                    continue;
                }
                System.out.print("pw: ");
                int pw = sc.nextInt();
                h.put(id, pw); // id와 pw를 저장
                System.out.println("회원가입이 완료되었습니다!");

            } else if (choice.equals("n")) { // 로그인 로직
                System.out.println("======= 로그인 =======");
                System.out.print("id: ");
                String lo = sc.next();
                System.out.print("pw: ");
                int p = sc.nextInt();

                // id와 pw 확인
                if (h.containsKey(lo) && h.get(lo).equals(p)) {
                    System.out.println("로그인 성공!");
                } else {
                    System.out.println("로그인 실패! id 또는 pw가 잘못되었습니다.");
                }

            } else if (choice.equals("x")) { // 종료 로직
                System.out.println("프로그램을 종료합니다.");
                break;
            } else { // 잘못된 입력 처리
                System.out.println("올바른 입력값을 선택하세요. (h/n/x)");
            }
        }
        sc.close(); // 스캐너 닫기
    }
}

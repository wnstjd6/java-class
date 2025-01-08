package day03;
import java.util.*;

class Member {
    String name;
    String gender;
    short age;
    String phone;
    String address;
    String note;

    public Member(String name, String gender, short age, String phone, String address, String note) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.note = note;
    }

    public void checkList() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + gender);
        System.out.println("전화번호 : " + phone);
        System.out.println("주소 : " + address);
        System.out.println("비고 : " + note);
        System.out.println("---------------------------------");
    }
}

public class Ex06 {
    private static HashMap<String, Member> members = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. 등록(가입)  2. 수정  3. 삭제  4. 검색  5. 목록 확인  6. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    registerMember();
                    break;
                case 2:
                    updateMember();
                    break;
                case 3:
                    deleteMember();
                    break;
                case 4:
                    searchMember();
                    break;
                case 5:
                    listMembers();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    continue;
            }
        }
    }

    private static void registerMember() {
        System.out.print("이름: ");
        String name = sc.nextLine();
        if (members.containsKey(name)) {
            System.out.println("이미 등록된 회원입니다.");
            return;
        }

        System.out.print("성별: ");
        String gender = sc.nextLine();
        System.out.print("나이: ");
        short age = sc.nextShort();
        sc.nextLine(); // 버퍼 비우기
        System.out.print("전화번호: ");
        String phone = sc.nextLine();
        System.out.print("주소: ");
        String address = sc.nextLine();
        System.out.print("비고: ");
        String note = sc.nextLine();

        members.put(name, new Member(name, gender, age, phone, address, note));
        System.out.println("회원이 등록되었습니다.");
    }

    private static void updateMember() {
        System.out.print("수정할 회원 이름: ");
        String name = sc.nextLine();
        if (!members.containsKey(name)) {
            System.out.println("회원이 존재하지 않습니다.");
            return;
        }

        Member member = members.get(name);
        System.out.print("새 전화번호: ");
        String newPhone = sc.nextLine();
        System.out.print("새 주소: ");
        String newAddress = sc.nextLine();
        System.out.print("새 비고: ");
        String newNote = sc.nextLine();

        member.phone = newPhone;
        member.address = newAddress;
        member.note = newNote;
        System.out.println("회원 정보가 수정되었습니다.");
    }

    private static void deleteMember() {
        System.out.print("삭제할 회원 이름: ");
        String name = sc.nextLine();
        if (members.remove(name) != null) {
            System.out.println("회원이 삭제되었습니다.");
        } else {
            System.out.println("회원이 존재하지 않습니다.");
        }
    }

    private static void searchMember() {
        System.out.print("검색할 회원 이름: ");
        String name = sc.nextLine();
        if (members.containsKey(name)) {
            members.get(name).checkList();
        } else {
            System.out.println("회원이 존재하지 않습니다.");
        }
    }

    private static void listMembers() {
        if (members.isEmpty()) {
            System.out.println("등록된 회원이 없습니다.");
        } else {
            System.out.println("회원 목록:");
            for (Member member : members.values()) {
                member.checkList();
            }
        }
    }
}

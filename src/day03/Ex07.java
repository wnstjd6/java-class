package day03;
import java.util.*;
class MemberManegement{

    String name;
    String garden;
    int age;
    String tel;
    String address;
    String note;
    public MemberManegement(String name, String garden, int age, String tel, String address, String note){
        this.name = name;
        this.garden = garden;
        this.age= age;
        this.tel = tel;
        this.address = address;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGarden() {
        return garden;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public void information(){
        System.out.println("이름 : "+name);
        System.out.println("성별 : "+garden);
        System.out.println("나이 : "+age);
        System.out.println("전화번호 : "+tel);
        System.out.println("주소 : "+address);
        System.out.println("비고 : "+note);
    }
}

public class Ex07 {
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<String,MemberManegement> h = new HashMap<String,MemberManegement>();

    public static void main(String[] args){
        while(true){
            System.out.println("1.등록(가입), 2.수정, 3.삭제, 4.검색, 5.목록 확인, 6.종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    accession();
                    break;
                case 2:
                    correction();
                    break;
                case 3:
                    Delete();
                  break;
                case 4:
                    search();
                    break;
                case 5:
                    inventory();
                   break;
                case 6:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력 방식입니다.\n 다시 입력해주세요.");
                    continue;
            }
        }
    }

    //메소드 안에서 다 객체 연결을해서 가동성이 높음
  private static void accession(){
        System.out.print("이름 : ");
        String name = sc.next();
        if(h.containsKey(name)){
            System.out.println("이미 등록된 회원입니다.");
            return;
        }
        System.out.print("성별 : ");
        String garden = sc.next();

        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("전화번호 : ");
        String tel = sc.next();

        System.out.print("주소 : ");
        String address = sc.next();

        System.out.print("비고 : ");
        String note = sc.next();

        h.put(name,new MemberManegement(name,garden,age,tel,address,note));
    }
     private static void correction(){
        System.out.print("수정할 회원 이름 입력 : ");
        String newName = sc.next();
        if(!h.containsKey(newName)){
            System.out.println("회원이 존재하지 않습니다.");
            return;
        }
        System.out.print("수정할 정보 선택 : ");
        MemberManegement manegement = h.get(newName);
        String correction = sc.next();
        switch (correction){
            case "이름":
                System.out.print("수정할 이름 : ");
                String Nname = sc.next();
                manegement.name = Nname;
                System.out.println("이름이 "+Nname+"으로 수정되었습니다.\n");
                return;
            case "성별":
                System.out.print("수정할 성별 : ");
                String newGender = sc.next();
                manegement.garden = newGender;
                System.out.print("성별이"+newGender+"으로 수정되었습니다.\n");
                return;
            case "나이":
                System.out.print("수정할 나이 : ");
                int newAge = sc.nextInt();
                manegement.age = newAge;
                System.out.println((newAge-1)+"에서 "+newAge+"으로 한살 더 먹으셨네요.\n");
                return;
            case "전화번호":
                System.out.print("수정할 전화번호 : ");
                String newTel = sc.next();
                manegement.tel = newTel;
                System.out.println("전화번호가"+newTel+"로 수정되었습니다.\n");
                return;
            case "주소":
                System.out.print("수정할 주소 : ");
                String newAdd = sc.next();
                manegement.address = newAdd;
                System.out.println("주소가 "+newAdd+"로 수정되었습니다.\n");
                return;
            case "비고":
                System.out.print("수정할 비고 : ");
                String newNote = sc.next();
                System.out.println("비고가 "+newNote+"으로 수정되었습니다.\n");
                return;
            default:
                System.out.println("다시 입력 해주세요.");
                return;
        }
    }

    private static void Delete(){
        System.out.print("삭제할 회원 이름 : ");
        String name = sc.next();
        if(h.remove(name)!=null){
            System.out.println("회원이 삭제되었습니다.");
        }
        else{
            System.out.println("없는 회원 입니다. \n 다시 입력해주새요.");
        }
    }
   private static void search(){
        System.out.print("검색할 회원 이름 : ");
        String name = sc.nextLine();
        if(h.containsKey(name)){
            h.get(name).information();
        }
        else{
            System.out.println("없는 회원입니다.");
        }
    }
    private static void inventory(){
        if(h.isEmpty()){
            System.out.println("없는 회원입니다.");
        }
        else{
            for(MemberManegement manegement : h.values()){
                System.out.println("======== 회원정보 =========");
                manegement.information();
            }
        }
    }
}

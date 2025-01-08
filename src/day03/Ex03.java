package day03;
import java.util.*;
class Student1{
  int id;
     String tel;
    public Student1(int id, String tel){
        this.id = id;
        this.tel = tel;
    }
}

public class Ex03 {
    public static void main(String[] args){
        HashMap<String,Student1> map = new HashMap<String,Student1>();
        map.put("황기태",new Student1(1,"010-111-1111"));
        map.put("이재문",new Student1(2,"010-222-2222"));
        map.put("김난윤",new Student1(3,"010-333-3333"));

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("검색할 이름 : ");
            String name = sc.nextLine();
            if(name.equals("종료")){
                System.out.println("종료합니다.");
                System.exit(0);
            }
            Student1 student1 =map.get(name);
            if(student1==null){
                System.out.println(name+"없은 사람입니다.");

            }
            else{
                System.out.println("id : "+student1.id+" tel : "+student1.tel);
            }

        }
    }
}

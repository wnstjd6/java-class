package day03;
import java.util.Scanner;
import java.util.ArrayList;

class Student{
    private String name;
    private boolean isPresent;

    public Student(String name){
        this.name = name;
        this.isPresent = false;
    }
    public String getName(){
        return name;
    }
    public boolean isPresent(){
        return isPresent;
    }
    public void markPresent(){
        this.isPresent = true;
    }
    public void markAbsent(){
        this.isPresent = false;
    }

}
class AttendanceManager{
    private ArrayList<Student>students;

    public AttendanceManager(){
        students = new ArrayList<>();
    }
    public void addStudent(String name){
        for(Student std : students) {
            if (std.getName().equals(name)) {
                System.err.println("이미 등록된 학생입니다.");
                return;
                }
            }
        students.add(new Student(name));
        System.out.println(name + "학생이 등록되었습니다.");
        }
        public void CheckList(){
        if(students.size()==0){
            System.out.println("등록된 학생이 없습니다.");
        }
            for(int i = 0; i<students.size(); i++){
                System.out.println(i+1+". "+students.get(i).getName());
            }
        }
        public void Attendance(String name){
            for(Student std : students){
                if(std.isPresent()==true){
                System.out.println("이미 출석되어있습니다.");
                return;
            }
                else if(std.getName().equals(name)){
                    std.markPresent();
                    System.out.println(name+"출석 처리 되었습니다.");
                    return;
                }
        }
            System.out.println("없는 학생입니다.");
        }
        public void AttendanceStatus(){
            System.out.println("출석현황 : \n ");
            int numbers = 1;
            for(Student std : students){
                if(std.isPresent()){
                    System.out.println(numbers+"."+std.getName()+" : 출석");
                    numbers++;
                }
                else if(!std.isPresent()){
                    System.out.println(numbers+". "+std.getName()+" : 결석");
                    numbers++;
                }
            }
        }

    }
public class Ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       AttendanceManager at = new AttendanceManager();
        try{
            while(true) {
                System.out.println("============= 출석 관리 프로그램 ===============");
                System.out.println("1.등록 2.학생목록 3.출석체크 4.출석현황 5.종료");
                System.out.print("선택 : ");
                int choice = sc.nextInt();
                switch (choice){
                    case 1 :
                        System.out.print("등록할 학생 이름 : ");
                        String name = sc.next();
                        at.addStudent(name);
                        break;

                    case 2 :
                        System.out.println("학생목록 : ");
                        at.CheckList();
                        break;
                    case 3 :
                        System.out.print("출석 학생 이름 : ");
                        String AttName = sc.next();
                        at.Attendance(AttName);
                        break;
                    case 4:
                        at.AttendanceStatus();
                        break;
                    case 5 :
                        System.out.println("프로그램을 종료합니다.");
                        System.exit(0);
                    default :
                        System.out.println("잘못된 입력 방식입니다. 다시 입력해주세요.");
                        continue;
                }
            }
        }catch (Exception e){
            System.err.println("에라 : "+e.getMessage());
        }
    }
}

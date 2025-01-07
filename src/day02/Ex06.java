package day02;
import java.util.*;
public class Ex06 {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<4; i++){
            System.out.print("이름을 입력하세요 : ");
            String s = sc.next();
            a.add(s);
        }
        for(int i = 0; i<a.size(); i++){
            String name = a.get(i);
            System.out.println(name +",");
        }
        int LongIntdex = 0;
        for(int i = 1; i<a.size(); i++){
            if(a.get(LongIntdex).length()<a.get(i).length()){
                LongIntdex = i;
            }
        }
        System.out.println("제일 긴 이름 : "+a.get(LongIntdex));
        sc.close();
    }
}

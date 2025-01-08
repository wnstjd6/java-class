package day03;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args){
        HashMap<String, Integer > map = new HashMap<>();
       map.put("준성",100);
       map.put("현서",0);
       map.put("jun",99);
       map.put("heo",1);
       map.put("yuk",91);

       System.out.println("HashMap의 요소의 개수 : "+map.size());

        Set<String> keys = map.keySet(); // key 문자열을 가진 집합을 Set 컬렉션에 리턴
        Iterator<String> it = keys.iterator();//key 문자열을 순서대로 접근할 수 있게 해주는 객체

        while(it.hasNext()){
            String name = it.next();
            int score = map.get(name);
            System.out.println(name+" : "+score);
        }
    }
}

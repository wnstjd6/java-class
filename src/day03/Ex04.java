package day03;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex04 {
    static void printList(LinkedList<String> l){
        Iterator<String> iterator = l.iterator();
        while(iterator.hasNext()){
            String e = iterator.next();
            String separator;
            if(iterator.hasNext())
                separator = "->";
            else separator = "\n";

            System.out.println(e+separator);

        }
    }
    public static void main(String[] args){
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트리스");
        myList.add(0,"터미네이터");
        myList.add(2,"아바타");

        Collections.sort(myList);
        printList(myList);

        int index = Collections.binarySearch(myList,"아바타")+1;
        System.out.println("아바타는 "+index+"번째 요소입니다.");
    }
}

package day01;
import java.util.*;

public class Ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("연산자 입력 : ");
        String s = sc.next();
        System.out.print("정수 입력 : ");
        int num2 = sc.nextInt();

        switch (s){
            case "+":
                System.out.println(num1+" "+s+" "+num2+" = "+(num1+num2));
                break;
            case "-":
                System.out.println(num1+" "+s+" "+num2+" = "+(num1+num2));
                break;
            case "*" :
            case "X":
                System.out.println(num1+" "+s+" "+num2+" "+(num1+num2));
                break;
            case "/":
                System.out.println(num1+" "+s+" "+num2+" = "+(num1+num2));
                break;
            default:
                System.out.println("다시 입력하시오");
                break;
        }
    }
}

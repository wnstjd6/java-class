package day01;
import java.util.*;

public class Ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        double num1 = sc.nextDouble();
        System.out.print("연산자 입력 : ");
        String s = sc.next();
        System.out.print("숫자 입력 : ");
        double num2 = sc.nextDouble();

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

package day01;
import java.util.*;
public class Ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("정수 입력 : ");
            int num1 = sc.nextInt();

            System.out.print("연산자 입력(+,-,*,/) : ");
            String str = sc.next();

            System.out.print("정수 입력 : ");
            int num2 = sc.nextInt();

            switch (str){
                case "+":
                    System.out.print(num1+" "+str+" "+num2+" = "+(num1+num2));
                    break;
                case "-":
                    System.out.print(num1+" "+str+" "+num2+" = "+(num1-num2));
                    break;
                case "*":
                case"X":
                    System.out.print(num1+" "+str+" "+num2+" = "+(num1*num2));
                    break;
                case"/":
                    System.out.print(num1+" "+str+" "+num2+" = "+(num1/num2));
                    break;
                default:
                    System.out.println("올바르지 않은 연산자 입니다. ");
                    break;
            }
      }catch (InputMismatchException e){
            System.out.println("숫자를 입력해주세요");
            sc.nextLine();
        }
        catch (Exception e){
            System.out.println("오류 발생 : "+e.getMessage());
        }
        finally {
         sc.close();
        }
    }
}

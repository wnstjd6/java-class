package day02;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       try {
           System.out.println("=============숫자 맞추기 게임==============");
           int ran = (int)(Math.random()*100)+1;
           int num1;
           int count = 0;
           System.out.print("1~100중 하나의 수 입력 : ");
           do{
               num1 = sc.nextInt();
               if(num1<0||num1>100){
                   System.out.println("형식에 맞게 써주세요.");
                   continue;
               }
               else if(num1>ran){
                   System.out.println("더 작은수");
                   count++;
               }
               else if(num1 < ran){
                   System.out.println("더 큰수");
                   count++;
               }
           }while(ran!=num1);
           System.out.println("성공 답 :  "+ran+"\n 횟수 : "+count);
       }catch (InputMismatchException e){
           System.out.println("숫자만 써주세요.");

       }catch (Exception e){
           System.out.println("error : "+e.getMessage());
       }
       finally {
           sc.close();
       }
    }
}

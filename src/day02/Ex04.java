package day02;
import java.util.*;
public class Ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int sum1 = 0;
        int sum2 = 0;
        try {
            System.out.print("플레이어1 닉네임 입력 : ");
            String player1 = sc.next();
            System.out.print("플레이어2 닉네임 입력 : ");
            String player2 = sc.next();
            while(true){


                System.out.println(player1+"님 차례\n 주사위 2개를 굴립니다.");
                int f1 = ran.nextInt(6)+1;
                int f2 = ran.nextInt(6)+1;
                sum1 = f1+f2;

                System.out.println(player2+"님 차례\n 주사위 2개를 굴립니다. ");
                int s1 = ran.nextInt(6)+1;
                int s2 = ran.nextInt(6)+1;
                sum2 = s1+s2;

                System.out.println(player1+"님의 2개 주사위 합은 "+(sum1));
                System.out.println(player2+"님의 2개 주사위 합은 "+(sum2));

                if(sum1==sum2||(sum1>10&&sum2>10)){
                    System.out.println("비기거나  두주사위 합이 10이 넘습니다.\n 게임을 다시 시작합니다.");
                    continue;
                }
                else if(sum1>10){
                    System.out.println(player1+"님의 주사위 합이 10을 넘어 패배하셨습니다. "+player2+"님의 승리");
                }
                else if(sum2>10){
                    System.out.println(player2+"님의 주사위 합이 10이 넘어 패배하셨습니다. "+player1+"님의 승리");
                }
                else if(sum1>sum2){
                    System.out.println(player1+"님이 이걌습니다.");
                }
                else if(sum1<sum2){
                    System.out.println(player2+"님이 이겼습니다.");
                }


                System.out.print("게임을 다시 시작 하시겠습니까 : y/n : ");
                String yn = sc.next();
                if(yn.equals("n")){
                    System.out.println("게임을 종료합니다.");
                    break;
                }
        }
        }catch (Exception e){
            System.out.println("에러 메세지 : "+e.getMessage());
        }finally {
            sc.close();
        }

    }
}

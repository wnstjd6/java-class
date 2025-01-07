package day02;
import java.util.*;
class Dice{
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    private int ran1;
    private int ran2;

    int sum1 = 0;
    int sum2 = 0;

    String player1;
    String player2;

    public void name(){
        System.out.print("player1 : ");
        player1 = sc.next();
        System.out.print("player2 : ");
        player2 = sc.next();
    }
    public int getRan1(){
        ran1 =  random.nextInt(6)+1;
        sum1+=ran1;
        return ran1;
    }
    public int getRan2(){
        ran2 = random.nextInt(6)+1;
        sum2+=ran2;
        return ran2;
    }
    public void Rt(){
        this.sum1 = 0;
        this.sum2 = 0;
    }


}
public class Ex05 {
    public static void main(String[] args){
        Dice dice = new Dice();
        Scanner s = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;

       System.out.println("=============주사위 게임 ===============");
       dice.name();
       while(true){

           System.out.println(dice.player1+" :  "+dice.getRan1());

           System.out.println(dice.player2+" : "+ dice.getRan2());

           System.out.println(dice.player1+" :  "+ dice.getRan1());

           System.out.println(dice.player2+" : "+ dice.getRan2());



           if ((dice.sum1>10&&dice.sum2>10)||dice.sum1==dice.sum2){
               System.out.println("비기거나 주사위 합이 들 다 10이 넘습니다. \n 게임 다시 시작");
               dice.Rt();
               continue;
           }
           else if(dice.sum1>10){
               System.out.println(dice.player1+"의 주사위 합이 10이 넘어 "+ dice.player2+"가 이겼습니다.");
               count2++;
               dice.Rt();
           }
           else if(dice.sum2>10){
               System.out.println(dice.player2+"의 주사위 합이 10이 넘어 "+dice.player1+"가 이겼습니다.");
               count1++;
                dice.Rt();

           }
           else if(dice.sum1>dice.sum2){
               System.out.println(dice.player1+"이 이겼습니다.");
               count1++;
               dice.Rt();
           }
           else if(dice.sum1<dice.sum2){
               System.out.println(dice.player2+"이 이겼습니다.");
               count2++;
            dice.Rt();
           }

           System.out.print("게임을 다시 시작하겠습니까? y/n : ");
           String ox = s.next();
           if(ox.equals("n")){
               System.out.println("게임을 종료합니다.");
               break;
           }
       }
       System.out.println(dice.player1+" 이긴 횟수 : "+count1);
       System.out.println(dice.player2+" 이긴 횟수 : "+count2);
       if(count1>count2){
           System.out.println("최종우승: "+dice.player1);
       }else
           System.out.println("최종우승 : "+dice.player2);







    }
}

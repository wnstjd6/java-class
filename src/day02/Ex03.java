package day02;
import java.util.*;
public class Ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        try {
            System.out.print("닉네임 입력 : ");
            String name = sc.next();
            int score = 0;
            int life = 10;
            while(true){
                System.out.println("현재 score : "+score);
                System.out.println("현재 life : "+life);
                System.out.println("====================================");
                int mran = ran.nextInt(6)+1;
                System.out.println("\n"+name+"님의 주사위 번호 : "+ran);
                int AiRan = ran.nextInt(6)+1;
                System.out.println("\ncomputer의 주사위 번호: "+AiRan);
                if(mran>AiRan){
                    System.out.println("\n"+name+"님의 승리\n");
                    score+=10;
                }
                else if(mran<AiRan){
                    System.out.println("\n아쉽게 computer의 승리네요.");
                    life--;
                }
                else {
                    System.out.println("비겼습니다.");
                }

                if(score==100){
                    System.out.println("\n게임에서 승리하였습니다. 축하드립니다. \n 게임을 종료합니다.");
                    break;
                }
                else if(life==0){
                    System.out.println("\n너무많이 지셔서 목숨이 남아나질 않았습니다.  "+name+"님 당신의 패배입니다."+"\n 게임을 종료합니다.");
                }

                System.out.print("게임을 계속 하시겠습니까?(예 : o, 아니요 : x) : ");
                sc.nextLine();
                String ox = sc.next();
                if(ox.equals("o")){
                    continue;
                }
                else if(ox.equals("x")){
                    System.out.println("게임을 종료합니다.");
                    break;
                }
                else{
                    System.out.println("제대로 입력해주세요.");
                }
            }

        }catch (Exception e){
            System.out.println("error : "+e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}

package day01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExchangeRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    try {
        System.out.print("한국돈(k), 미국돈(u) : ");
        String money = sc.next().toLowerCase();

        System.out.print("환율 입력 : ");
        double bo = sc.nextDouble();

        if (bo <= 0) {
            System.out.println("환율 값은 0보다 커야 합니다. 프로그램을 종료합니다.");
            sc.close();
            return;
        }

        if (money.equals("k")) {
            System.out.print("한국돈 입력 : ");
            double kr = sc.nextDouble();
            if (kr < 0) {
                System.out.println("금액은 음수일 수 없습니다.");
            } else {
                System.out.printf("달러로 환산된 값: %.4f",(kr / bo));
            }
        } else if (money.equals("u")) {
            System.out.print("달러 입력 : ");
            double us = sc.nextDouble();
            if (us < 0) {
                System.out.println("금액은 음수일 수 없습니다.");
            } else {
                System.out.println("한국돈으로 환산된 값: " + (bo * us));
            }
        } else {
            System.out.println("K 또는 U 중 하나를 선택하세요.");
        }


    }catch (InputMismatchException e){
        System.out.println("올바른 형식으로 써주세요");
    }
    finally {
        sc.close();
    }


    }
}

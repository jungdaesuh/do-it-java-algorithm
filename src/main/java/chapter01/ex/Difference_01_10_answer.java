package chapter01.ex;

import java.util.Scanner;

public class Difference_01_10_answer {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 값：");
        int a = stdIn.nextInt();

        int b=0;
        while (true) {
            System.out.print("b의 값：");
            b = stdIn.nextInt();
            if (b > a)
                break;
            System.out.println("a보다 큰 값을 입력하세요!");
        }

        System.out.println("b - a는 " + (b - a) + "입니다.");

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime) / 1000;
        System.out.println("시간차이(m): " + secDiffTime);
    }



}

package chap02.ex;

import java.util.Scanner;

public class DayOfYearWhile_02_08 {

    // 각 달의 일 수부터 먼저 작성
    static int[][] daysOfMonth = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    // 윤년 or 평년 판단
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 서기 y년 m월 d일의 그해 경과 수
    static int dayOfYear(int y, int m, int d) {
        while (m-- != 0) {
            d += daysOfMonth[isLeap(y)][m - 1];
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일 수를 구합니다.");

        do {
            System.out.print("년: "); int year = stdIn.nextInt();
            System.out.print("월: "); int month = stdIn.nextInt();
            System.out.print("일: "); int day = stdIn.nextInt();

            System.out.println("그해 " + dayOfYear(year, month, day) + "일째입니다.");
//            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
            System.out.print("한번 더 할까요? (1.예 / 0.아니오): ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}

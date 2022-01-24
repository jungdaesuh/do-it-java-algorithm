package chap02.ex;

import java.util.Scanner;

public class DayOfYearWhile_02_09 {

    // 각 달의 일 수부터 먼저 작성
    static int[][] daysOfMonth = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    // 윤년 or 평년 판단
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

//    // 내가 작성한 코드
//    static int leftDayOfYear(int y, int m, int d) {
//        int leftDay1 = 0;
//        int leftDay2;
//        int daySum;
//        for (int i = m; i < 12; i++) {
//            leftDay1 += daysOfMonth[isLeap(y)][i];
//        }
//
//        leftDay2 = daysOfMonth[isLeap(y)][m - 1] - d;
//        daySum = leftDay1 + leftDay2;
//        return daySum;
//    }

    // 답안지
    static int leftDayOfYear(int y, int m, int d) {
        int days = d;

        for (int i = 1; i < m; i++) {
            days += daysOfMonth[isLeap(y)][i - 1];
        }
        return 365 + isLeap(y) - days;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("그 해 남은 일 수를 구합니다.");

        do {
            System.out.print("년: "); int year = stdIn.nextInt();
            System.out.print("월: "); int month = stdIn.nextInt();
            System.out.print("일: "); int day = stdIn.nextInt();

            System.out.println("그해 " + leftDayOfYear(year, month, day) + "일 남았습니다.");
            System.out.print("한번 더 할까요? (1.예 / 0.아니오): ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}

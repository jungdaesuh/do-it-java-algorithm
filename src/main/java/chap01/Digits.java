package chap01;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("2자리의 정수 값을 입력하시오.");

        int n;

        do {
            System.out.print("정수 값: ");
            n = stdIn.nextInt();
        } while (n < 10 || n > 99);

        System.out.println("두자리의 정수 값은 " + n + "입니다.");
    }
}

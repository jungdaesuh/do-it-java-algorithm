package chap01.ex;

import java.util.Scanner;

public class Square_01_14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("사각형을 만드세요.");

        int n;

        do {
            System.out.print("양수를 입력하세요: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

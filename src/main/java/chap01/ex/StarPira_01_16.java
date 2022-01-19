package chap01.ex;

import java.util.Scanner;

public class StarPira_01_16 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;

        System.out.println("피라미드를 만드세요.");

        do {
            System.out.print("양수를 입력하세요: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        System.out.println("피라미드");
        pyramid(n);
    }

    static void pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

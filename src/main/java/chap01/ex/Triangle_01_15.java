package chap01.ex;

import java.util.Scanner;

public class Triangle_01_15 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;

        do {
            System.out.print("양의 점수를 입력하시오: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        System.out.println("왼쪽 아래 직각 이등변");
        triangleLB(n);

        System.out.println("왼쪽 위 직각 이등변");
        triangleLU(n);

        System.out.println("왼쪽 위 직각 이등변");
        triangleLU1(n);

        System.out.println("오른쪽 위 직각 이등변");
        triangleRU(n);

        System.out.println("오른쪽 아래 직각 이등변");
        triangleRB(n);
    }

    static void triangleLB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //내가 짠 코드
    static void triangleLU(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //해답지
    static void triangleLU1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package chap01.ex;

import java.util.Scanner;

public class SumOf_01_09 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 a와 b 사의 값을 구합니다.");
        System.out.print("정수 a의 값은: ");
        int a = stdIn.nextInt();
        System.out.print("정수 b의 값은: ");
        int b = stdIn.nextInt();

        System.out.println("정수 a와 b를 합한 값은 " + sumOf(a,b) + "입니다.");


    }

    static int sumOf(int a, int b) {
        // a, b. min, max.

        int min = 0;
        int max = 0;

        if (a > b) {
            max = a;
            min = b;
        }
        if (b > a) {
            max = b;
            min = a;
        }

        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return (sum);
    }
}

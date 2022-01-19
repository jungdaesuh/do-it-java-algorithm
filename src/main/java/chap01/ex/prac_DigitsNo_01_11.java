package chap01.ex;

import java.util.Scanner;

public class prac_DigitsNo_01_11 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n;

        System.out.println("a의 값을 입력하시오: ");
        do {
            System.out.print("정수 값: ");
            n = stdIn.nextInt();
        } while (n < 0);

        int numDigits = 0;

        while (n > 0) {
            n /= 10;
            numDigits++;
        }
        System.out.println(numDigits);

    }
}

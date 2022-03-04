package chap05.ex;

import java.util.Scanner;

public class FactorialEx_05_01 {
    static int fact(int x) {
        int num = 1;
        for (int i = x; i > 0; i--) {
            num *= i;
        }
        return num;
    }

    static int factWhileLoop(int x) {
        int num = 1;

        while (x > 1) {
            num *= x--;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.：");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + fact(x) + "입니다.");
    }

}

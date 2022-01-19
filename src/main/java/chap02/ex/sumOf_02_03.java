package chap02.ex;

import java.util.Random;
import java.util.Scanner;

public class sumOf_02_03 {
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random random = new Random();

        System.out.print("요솟수는：");
        int num = stdIn.nextInt();     // 요솟수

        int[] a = new int[num];    // 길이가 num인 배열

        for (int i = 0; i < num; i++) {
            a[i] = random.nextInt(20);
            System.out.println("a[" + i + "]: " + a[i]);
        }

        System.out.println("합계는 " + sumOf(a) + "입니다.");

//    //내가 작성한 코드
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("요솟값을 입력하세요: ");
//        int num = stdIn.nextInt();
//        int[] a = new int[num];
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = random.nextInt(20);
//            System.out.println("a[" + i + "]: " + a[i]);
//        }
//
//        int b = 0;
//        for (int i = 0; i < a.length; i++) {
//            b += a[i];
//        }
//
//        System.out.println(b);
//
//    }
    }
}


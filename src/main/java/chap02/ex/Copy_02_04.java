package chap02.ex;

import java.util.Random;
import java.util.Scanner;

public class Copy_02_04 {
//    // 해답지
//    // 배열 b의 모든 요소를 배열 a에 복사
//    static void copy(int[] a, int[] b) {
//        int num = a.length <= b.length ? a.length : b.length;
//        for (int i = 0; i < num; i++)
//            a[i] = b[i];
//    }
//
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//
//        System.out.print("a의 요솟수는 ：");
//        int numa = stdIn.nextInt(); // 요솟수
//        int[] a = new int[numa]; // 요솟수 numa인 배열
//        for (int i = 0; i < numa; i++) {
//            System.out.print("a[" + i + "] : ");
//            a[i] = stdIn.nextInt();
//        }
//
//        System.out.print("b의 요솟수는 ：");
//        int numb = stdIn.nextInt(); // 요솟수
//        int[] b = new int[numb]; // 요솟수 numb인 배열
//        for (int i = 0; i < numb; i++) {
//            System.out.print("b[" + i + "] : ");
//            b[i] = stdIn.nextInt();
//        }
//
//        copy(a, b); // 배열 b의 모든 요소를 배열 a에 복사
//
//        System.out.println("배열 b의 모든 요소를 배열 a에 복사했습니다.");
//        for (int i = 0; i < numa; i++)
//            System.out.println("a[" + i + "] = " + a[i]);
//    }

    //내가 작성한 코드
    //배열 a를 배열 b에 대입
    static void copy(int[] a, int[] b) {
        int numLength = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < numLength; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Random random = new Random();

        int[] a = new int[random.nextInt(5)];

        int[] b = new int[random.nextInt(10)];

        System.out.println("a 배열");
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(20);
            System.out.println(a[i]);
        }

        System.out.println("b 배열");
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(20);
            System.out.println(b[i]);
        }

        copy(a, b);

        System.out.println("배열 a");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("배열 b");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

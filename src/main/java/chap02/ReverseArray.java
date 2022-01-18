package chap02;

import java.util.Random;
import java.util.Scanner;

public class ReverseArray {

    //배열 요소 a[idx1]과 a[idx2]을 값을 바꿈
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    //배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random random = new Random();

        System.out.print("요솟값을 입력하세요: ");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(20);
            System.out.println("배열[" + i + "]: " + a[i]);
        }


        reverse(a);

        System.out.println("배열 역순 정렬");
        for (int i = 0; i < a.length; i++) {
            System.out.println("배열[" + i + "]: " + a[i]);
        }

    }
}

package chap02.ex;

import java.util.Random;
import java.util.Scanner;

public class ReverseArrayEx_02_02 {
    //배열 요소 a[idx1]과 a[idx2]을 값을 바꿈
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    //배열 a의 요소 값을 나타냄
    static void printList(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        System.out.print("오리지널 배열: ");
        printList(a);
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println("a[" + i + "]과(와) a[" + (a.length - i - 1) + "]를 교환합니다.");
            swap(a, i, a.length - i - 1);
            printList(a);
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
//            System.out.println("a[" + i + "]: " + a[i]);
        }


        reverse(a);

        System.out.println("역순 정렬을 마쳤습니다.");


    }

}

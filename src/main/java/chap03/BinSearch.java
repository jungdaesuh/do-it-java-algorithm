package chap03;

import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수：");
        int num = stdIn.nextInt();
        int[] x = new int[num];                // 요솟수가 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]：");            // 첫 요소 입력
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]：");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        int index = binSearch(x, num, key);

        System.out.println(index);
    }

    static int binSearch(int[] a, int num, int key) {
        int firstIndex = 0;
        int lastIndex = num - 1;
        int midIndex;

        do {
            midIndex = (firstIndex + lastIndex) / 2;
            if (key == a[midIndex])
                return midIndex;
            else if (key > midIndex)
                firstIndex = midIndex + 1;
            else
                lastIndex = midIndex - 1;

        } while (firstIndex <= lastIndex);

        return -1;
    }
}
package chap02.ex;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand2_02_01 {
    static int maxOf(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        // 난수가 0으로 나올 수 있으므로 1을 더 해줌.
        int numPpl = 1 + rand.nextInt(20);

        int[] height = new int[numPpl];

        System.out.println("키 값은 아래와 같습니다.");

        for (int i = 0; i < numPpl; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] = " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}

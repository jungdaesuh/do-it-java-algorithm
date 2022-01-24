package chap03;

import java.util.Random;
import java.util.Scanner;

public class SeqSearchSen {

    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;
        a[n] = key;

//        for (i = 0; i < a.length; i++) {
//            if (i == key)
//                break;
//            i++;
//        }

        while (true) {
            if (i == key) {
                break;
            }
            i++;
        }

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random random = new Random();

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(10);
            System.out.println(x[i]);
        }

        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        int idx = seqSearchSen(x, num, key);

        if (idx == -1)
            System.out.println("none");
        else
            System.out.println(idx);
    }
}

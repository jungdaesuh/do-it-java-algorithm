package chap01;

public class Max3m {
    static int min3(int a, int b, int c, int d) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;

        return min;
    }

    public static void main(String[] args) {
        System.out.println("min3(3,2,1) = " + min3(3, 2, 1, 4));
        System.out.println("min3(3,2,1) = " + min3(3, 2, 4, 1));
        System.out.println("min3(3,2,1) = " + min3(3, 4, 1, 2));
        System.out.println("min3(3,2,1) = " + min3(4, 2, 1, 3));
    }
}

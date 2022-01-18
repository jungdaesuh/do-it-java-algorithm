package chapter01;

public class Multi99TableEx_01_12 {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();
        System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n---+------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d  |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i*j);
            }
            System.out.println();
        }

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("시간차이(m): " + secDiffTime);
    }
}

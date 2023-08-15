import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            double d = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
            if (x1-x2 == 0 && y1-y2 == 0 && r1 == r2) {
                System.out.println(-1);
            } else if (d + Math.min(r1, r2) < Math.max(r1, r2)) {
                System.out.println(0);
            } else if (d == r1 + r2 || d == Math.abs(r1 - r2)) {
                System.out.println(1);
            } else if (d < r1 + r2) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x;
            for (int j = 0; j < y; j++) {
                if (j == 0) {
                    x = x%10;
                } else {
                    x = (z*x)%10;
                }
            }
            if (x == 0) {
                System.out.println(10);
            } else {
                System.out.println(x);
            }
        }
    }
}
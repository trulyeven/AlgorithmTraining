import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int a=0; a < n; a++) {

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
        
            int t = sc.nextInt();
            int cnt = 0;

            for (int i=0; i < t; i++) {
                int cx = sc.nextInt();
                int cy = sc.nextInt();
                int r = sc.nextInt();
                int d1 = (x1-cx)*(x1-cx)+(y1-cy)*(y1-cy);
                int d2 = (x2-cx)*(x2-cx)+(y2-cy)*(y2-cy);

                if ((d1 > Math.pow(r,2) && d2 > Math.pow(r,2)) || (d1 < Math.pow(r,2) && d2 < Math.pow(r,2))) {
                } else if (d1 > Math.pow(r,2) || d2 > Math.pow(r,2)) {
                    cnt++;
                } else if (d1 < Math.pow(r,2) || d2 < Math.pow(r,2)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
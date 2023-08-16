import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] array = new int[41];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1] + array[i-2];
        }

        for (int i=0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                System.out.println(1 + " " + 0);
            } else {
                System.out.println(array[x-1] + " " + array[x]);
            }
        }
    }
}
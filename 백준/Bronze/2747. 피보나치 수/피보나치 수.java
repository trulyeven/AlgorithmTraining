import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        if (n <= 1) {
            System.out.println(n);;
        } else {
            int[] fibArray = new int[n + 1];
            fibArray[0] = 0;
            fibArray[1] = 1;
            
            for (int i = 2; i <= n; i++) {
                fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
            }
        
            System.out.println(fibArray[n]);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String result = "";

        for (int i = 0; i < n; i++) {
            String str1 = sc.next();
            char[] charArray1 = str1.toCharArray();
            
            if (result == "") {
                for (char c : charArray1) {
                    result += c;
                }
            } else {
                char[] charArray2 = result.toCharArray();
                for (int j = 0; j < charArray1.length; j++) {
                    if (charArray1[j] != charArray2[j]) {
                        charArray2[j] = '?';
                    }
                }
                result = "";
                for (char c : charArray2) {
                    result += c;
                }
            }
        }
        System.out.println(result);
    }
}
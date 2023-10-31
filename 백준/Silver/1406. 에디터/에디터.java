import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        LinkedList<Character> strArr = new LinkedList<>();

        for (char c : str.toCharArray()) {
            strArr.add(c);
        }

        ListIterator<Character> cursor = strArr.listIterator(strArr.size());

        for (int i = 0; i < n; i++) {
            char[] cmd = br.readLine().trim().toCharArray();
            switch (cmd[0]) {
                case 'L':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                    }
                    break;
                case 'D':
                    if (cursor.hasNext()) {
                        cursor.next();
                    }
                    break;
                case 'B':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                case 'P':
                    char ist = cmd[2];
                    cursor.add(ist);
                    break;
            }
        }
        for(Character s : strArr) bw.write(s);
        bw.flush();
		bw.close(); 
    }
}
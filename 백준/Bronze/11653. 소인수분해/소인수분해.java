import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        if(n == 1) return;

        for(int i = 2; i <= n; i++) {
            while (n%i == 0) {
                n/= i;
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if(n == -1) break; //-1이면 종료

            int[] a = new int[n];

            int sum = 0;
            for(int i = 1; i < n; i++) {
                if(n%i == 0) {
                    a[i] = i;
                    sum += i;
                }
            }

            // 약수가 아닌 경우
            if (sum != n) {
                sb.append(n).append(" is NOT perfect. \n");
                continue;
            }

            // 약수인 경우
            sb.append(n).append(" = ").append(1);
            for(int i = 1; i < n; i++) {
                if(a[i] != 0 && a[i] != 1) sb.append(" + ").append(a[i]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
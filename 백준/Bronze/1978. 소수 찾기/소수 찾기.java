import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 소수판단
            for(int j = 2; j <= num; j++) {
                if(j == num) {
                    count++;
                }
                if(num % j == 0) {
                    break;
                }
            }
        }

        System.out.println(count);


    }
}
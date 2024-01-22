import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        for(int i = 0; i < n; i++) {
            int tmp = i;
            int sum = 0;

            while (tmp != 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            if(sum + i == n) {
              answer = i;
              break;
            }
        }

        System.out.println(answer);
    }
}
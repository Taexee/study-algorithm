import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int s = 1;
        int e = 1;
        int sum = 1;

        while (e != n) {
            if(sum == n) {
                count++;
                e++;
                sum = sum + e;
            } else if (sum > n) {
                sum = sum - s;
                s++;
            } else {
                e++;
                sum = sum + e;
            }
        }
        System.out.println(count);
    }
}
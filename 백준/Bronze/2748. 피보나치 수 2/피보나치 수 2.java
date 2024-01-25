import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] a = new long[91];
        a[1] = 1;

        int n = Integer.parseInt(br.readLine());
        for(int i = 2; i <= n; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        System.out.println(a[n]);
    }
}
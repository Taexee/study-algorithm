import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for(int i  = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long count = 0;

        count += n; // 총감독관

        for(int i = 0; i< n; i++) {
            a[i] -= b;
            if(a[i] <= 0) continue;
            count += a[i]/c;
            if(a[i] % c != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
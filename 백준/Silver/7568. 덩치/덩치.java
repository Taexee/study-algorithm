import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][2];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            a[i][0] = Integer.parseInt(st.nextToken());
            a[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i< n; i++) {
            int k = 1; // 등수
            for(int j = 0; j < n; j++) {
                if(a[i][0] < a[j][0] && a[i][1] < a[j][1]) { // 
                    k++;
                }
            }

            System.out.print(k + " ");
        }

    }
}
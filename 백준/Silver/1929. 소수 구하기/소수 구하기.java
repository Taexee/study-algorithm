import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] a = new int[N+1];

        for(int i = 2; i <= N; i++){
            a[i] = i;
        }

        for(int i = 2; i <= Math.sqrt(N); i++){
            if(a[i]==0) continue;
            for(int j = i+i; j <= N; j = j+i){
                a[j] = 0;
            }
        }

        for(int i = M; i <= N; i++){
            if(a[i] != 0)
                System.out.println(a[i]);
        }
    }
}
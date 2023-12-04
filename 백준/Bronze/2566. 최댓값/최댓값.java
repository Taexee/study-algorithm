import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        String answer = "";

        for(int i = 1; i <= 9; i++){
            StringTokenizer st  = new StringTokenizer(br.readLine());
            for(int j = 1; j <= 9; j++){
                int n = Integer.parseInt(st.nextToken());
                if(max <= n) {
                    max = n;
                    answer = String.valueOf(i) + " " + String.valueOf(j);
                }
            }
        }
        br.close();
        System.out.println(max);
        System.out.println(answer);
    }
}
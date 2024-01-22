import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        // 카드 배열
        st = new StringTokenizer(br.readLine());
        int[] cards = new int[n];
        for(int i  = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        
        int answer = 0;
        for(int i = 0; i < (n-2); i++) {
            for(int j = i+1; j < (n-1); j++) {
                for(int k = j+1; k < n; k++) {
                    int tmp = cards[i] + cards[j] + cards[k];
                    if(tmp <= m) answer = Math.max(answer, tmp);
                }
            }
        }
        
        System.out.println(answer);

    }
}
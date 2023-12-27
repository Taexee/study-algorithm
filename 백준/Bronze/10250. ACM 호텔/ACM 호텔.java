import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스

        for(int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken()); // 층
            int w = Integer.parseInt(st.nextToken()); // 방
            int n = Integer.parseInt(st.nextToken()); // 순서

            if(n % h == 0){
                System.out.println((h * 100) + (n / h));
            } else {
                System.out.println(((n % h) * 100) + (n / h) + 1);
            }
        }
    }
}

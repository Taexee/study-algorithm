import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n =  Integer.parseInt(st.nextToken()); // 수
        int b = Integer.parseInt(st.nextToken()); // 진법
        br.close();

        StringBuilder sb = new StringBuilder(); // 정답
        int num = 0; // 자리수
        int idx = 0; // 지수

        while (n > 0) {
            if(n % b >= 10){
                sb.append((char)((n % b) + 55));
            } else {
                sb.append(n % b);
            }
            n /= b;
        }
        System.out.println(sb.reverse().toString());
    }
}
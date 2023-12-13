import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken(); // 수
        int b = Integer.parseInt(st.nextToken()); // 진법
        br.close();

        int answer = 0; // 정답
        int num = 0; // 자리수
        int idx = 0; // 지수
        for(int i = n.length()-1; i >= 0; i--) {
            char c = n.charAt(i);
            // 0~9인 경우 그대로
            if(c >= '0' && c <= '9'){
                num = c - '0';
            } else { // 대문자는 숫자로 변환
                num = c - 55;
            }
            answer += num * Math.pow(b, idx++);
        }

        System.out.println(answer);
    }
}
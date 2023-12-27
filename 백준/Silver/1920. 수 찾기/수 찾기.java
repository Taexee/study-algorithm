import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 데이터의 개수
        int[] data = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            data[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(data); // 오름차순으로 정렬

        int m = Integer.parseInt(br.readLine()); // 찾을 데이터 수
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            boolean find = false;
            int target = Integer.parseInt(st.nextToken()); // 찾을 데이터

            // 이진 탐색 시작
            int start = 0;
            int end = data.length - 1;
            while (start <= end) {
                int midi = (start + end) / 2;
                int midV = data[midi];
                if (midV > target) {
                    end = midi - 1;
                } else if (midV < target) {
                    start = midi + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if(find) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}

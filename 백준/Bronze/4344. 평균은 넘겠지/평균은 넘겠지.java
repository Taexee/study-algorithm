import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int stu = Integer.parseInt(st.nextToken());
            int[] arr = new int[stu]; // 점수 배열
            double sum = 0; // 점수 합
            for(int j = 0; j < stu; j++){
                int s = Integer.parseInt(st.nextToken());
                arr[j] = s;
                sum += s;
            }

            double avg = sum / stu; // 평균
            double count = 0; // 평균 넘는 학생

            for(int k = 0; k < stu; k++){
                if(arr[k] > avg) count++;
            }

            System.out.printf("%.3f%%\n", (count/stu)*100);

        }
    }
}

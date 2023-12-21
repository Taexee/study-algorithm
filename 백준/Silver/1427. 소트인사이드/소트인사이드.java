import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int[] num = new int[n.length()];
        for(int i = 0; i < n.length(); i++) {
            num[i] = Integer.parseInt(n.substring(i, i+1));
        }

        for(int i = 0; i < n.length(); i++) {
            // 최댓값 찾기
            int max = i;
            for(int j = i+1; j < n.length(); j++) {
                if(num[j] > num[max]) {
                    max = j;
                }
            }

            // swap
            if(num[i] < num[max]) {
                int tmp = num[i];
                num[i] = num[max];
                num[max] = tmp;
            }
        }

        for(int i : num){
            System.out.print(i);
        }
    }
}

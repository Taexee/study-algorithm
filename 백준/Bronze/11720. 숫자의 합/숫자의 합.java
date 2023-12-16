import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String numStr = br.readLine();
        br.close();

        int sum = 0;
        String[] num = numStr.split("");
        for(int i = 0; i < n; i++) {
            sum += Integer.parseInt(num[i]);
        }
        System.out.println(sum);
    }
}
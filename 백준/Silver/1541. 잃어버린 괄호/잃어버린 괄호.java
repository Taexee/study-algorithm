import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int answer = 0;
        String[] str = s.split("-");
        for(int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if(i == 0) answer += temp;
            else answer -= temp;
        }
        System.out.println(answer);
    }

    private static int mySum(String s) {
        int sum = 0;
        String[] number = s.split("[+]");
        for(int j = 0; j < number.length; j++) {
            sum += Integer.parseInt(number[j]);
        }
        return sum;
    }
}

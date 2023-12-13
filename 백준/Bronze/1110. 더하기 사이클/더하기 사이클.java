import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cycle = n;
        int cnt = 0;

        while (true){
            n = ((n % 10) * 10) + (((n%10) + (n/10)) % 10);
            cnt++;
            if(cycle == n){
                break;
            }
        }
        System.out.println(cnt);
    }
}
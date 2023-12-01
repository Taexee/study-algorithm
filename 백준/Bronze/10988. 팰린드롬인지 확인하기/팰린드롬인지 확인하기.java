import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        int l = str.length();
        int answer = 1;
        for(int i = 0; i < l/2; i++){
            if(str.charAt(i) != str.charAt(l-i-1)){
                answer = 0;
            }
        }
        System.out.println(answer);
    }
}
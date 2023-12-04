import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        String answer = "";

        for(int i = 0; i < arr.length; i++) {
            String s = br.readLine();
            for(int j = 0; j < s.length(); j++){
                arr[i][j] = s.charAt(j);
            }
        }

        for(int j = 0; j < arr[0].length; j++){
            for(int i = 0; i < 5; i++){
                if(arr[i][j] == 0) {
                    continue;
                }
                answer += String.valueOf(arr[i][j]);
            }
        }
        
        br.close();
        System.out.println(answer);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int sum = 0;
            int num = 0;
            char[] score = br.readLine().toCharArray();
            for(int j = 0; j < score.length; j++){

                if(score[j] == 'O') {
                    num++;
                } else {
                    num = 0;
                }
                sum += num;
            }
            System.out.println(sum);
        }
    }
}

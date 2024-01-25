import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] apt = new int[15][15]; //아파트 배열
        for(int i = 0; i < 15; i++){
            apt[i][1] = 1; // i층 1호
            apt[0][i] = i; // 0층 i호
        }

        for(int i = 1; i < 15; i++) { // i층
            for(int j = 2; j < 15; j++) { // j호
                // 1층의 2호는 0층의2호+1층1호 -> i-1층 j호 + i층 j-1호

                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apt[k][n]);
        }
        
    }
}
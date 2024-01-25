import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;

        for(int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);
        int a = 0, b = 0; // 가짜 난쟁이
        for(int i = 0; i < 9; i++) {
            for(int j = i+1; j < 9; j++) {
                if(sum - arr[i] - arr[j] == 100) {
                    a = arr[i];
                    b = arr[j];
                }
            }
        }

        for(int num : arr) {
            if(num == a || num == b) continue; // 가짜 난쟁이 제외
            System.out.println(num);
        }

    }
}
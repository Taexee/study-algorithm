import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int k = 0; k < m; k++) { // m번 정렬
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken()) - 1; // 정렬 시작 인덱스
            int j = Integer.parseInt(st.nextToken()) - 1; // 정렬 끝 인덱스

            while (i < j) {
                int tmp = arr[i]; 
                arr[i++] = arr[j];
                arr[j--] = tmp; 
            }
        }
        
        br.close();
        
		for(int rr : arr) {
			System.out.print(rr + " ");
		}
	}
}
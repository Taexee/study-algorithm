import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 바구니 
		int[] arr = new int[n]; // 바구니 배열
		
		int m = sc.nextInt(); // 공 넣는 횟수
		
		for(int i=0; i<m; i++) {
			
			// i번부터 j번까지 k번 번호 공 넣음
			int start = sc.nextInt(); // i
			int end = sc.nextInt(); // j
			int ball = sc.nextInt(); // k
			
			for(int j = start-1; j<end; j++) {
				arr[j] = ball;
			} // 공 집어넣기
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
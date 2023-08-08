import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 바구니 
		int[] arr = new int[n]; // 바구니 배열
		
		int m = sc.nextInt(); // 공 바꾸는 횟수
		
	
		for(int i = 0; i < n; i++) { // 공 넣기
			arr[i] = i + 1;
		}
		for(int k = 0; k < m; k++) {
			// i번 j번 공 바꿈
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			int temp = arr[i - 1];
			arr[i - 1] = arr[j - 1];
			arr[j - 1] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
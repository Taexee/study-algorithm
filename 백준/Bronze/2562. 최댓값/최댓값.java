import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		
		int arr[] = new int[9];
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0; // 최댓값 
		int index = 0; // 인덱스
		int cnt = 0; // 인덱스 구하기 위한 변수
		
		for(int i : arr) {
			cnt++;
			if(i > max) {
				max = i; index = cnt;
			}
		}
		
		// 최댓값
		System.out.println(max);
		// 최댓값 인덱스 
		System.out.println(index);

	}
}

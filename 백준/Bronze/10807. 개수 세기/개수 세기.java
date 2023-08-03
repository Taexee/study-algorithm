import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int a = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == a) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
 
	}
}

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] arr = new double[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		double avg = 0;
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += (double)(arr[i]/arr[n-1]*100);
		}
		avg = sum / (double)n;
		System.out.println(avg);
		
	}
}
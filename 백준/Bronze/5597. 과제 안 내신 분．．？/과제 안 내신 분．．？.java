import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[31];
		
		for(int i = 0; i < 28; i++) {
			arr[sc.nextInt()] = true;
		}
		
		for(int j = 1; j <= 30; j++) {
			if(!arr[j]) {
				System.out.println(j);
			}
		}
	}
}
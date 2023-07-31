import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
		
			int a = in.nextInt();
			int b = in.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			} else {
				System.out.println(a + b);
			}
		}
		
	}
}
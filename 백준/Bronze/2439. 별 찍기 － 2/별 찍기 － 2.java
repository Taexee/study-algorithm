import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int count = in.nextInt();
		
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= (count - i); j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
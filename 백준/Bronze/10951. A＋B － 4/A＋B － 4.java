import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// hasNextInt 입력값이 정수일 경우 true 정수가 아니면 예외를 던지고 false반환
		
		while(in.hasNextInt()) {	
			int a = in.nextInt();
			int b = in.nextInt();
		
			System.out.println(a + b);
	
		}
		
	}
}
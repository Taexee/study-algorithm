import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		// StringBuilder클래스 reverse()메서드 사용
		// 1. StringBuilder 생성과 동시에 append()에 입력값 넣어줌
		// 2. StringBuilder 타입으로 반환
		// 3. reverse() 메서드 사용해 뒤집고 문자열로 반환하기 위해 toString()사용
		// 4. int 타입으로 변환
		a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
		
		System.out.println(a > b ? a : b);
	}

}

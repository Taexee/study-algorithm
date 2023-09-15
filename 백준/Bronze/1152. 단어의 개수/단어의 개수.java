import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine(); // 문자열
		
		StringTokenizer t = new StringTokenizer(S, " "); // 공백별로 자르기
		
		System.out.println(t.countTokens()); // 토큰 개수
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		if (year%400 == 0) { // 400배수일 때
			System.out.print(1);
		} else if (year%4 == 0 && year%100 != 0) { //4의 배수고 100의 배수가 아닐 
			System.out.print(1);
		} else { // 나머지는 모두 윤년아님
			System.out.print(0);
		}
	}
}
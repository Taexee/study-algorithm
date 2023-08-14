import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i = sc.nextInt();
		sc.close();
		System.out.println(s.charAt(i-1));
	}
}
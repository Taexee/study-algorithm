import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			h.add(sc.nextInt() % 42);
			//HashSet.add() 중복없이 저장 
		}
		
		sc.close();
		System.out.println(h.size());
	}
}
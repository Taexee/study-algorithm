import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// long int 4바이트 가능
		// long 4바이크 추가
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n/4; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
		
    }
	
}
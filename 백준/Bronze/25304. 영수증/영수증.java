import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int price = scanner.nextInt();
		int count = scanner.nextInt();
		int total = 0;
		
		for(int i = 0; i < count; i++) {
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    total += a * b;
		}
		
        if(total == price){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}

}

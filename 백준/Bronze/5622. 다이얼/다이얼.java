import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		int len = input.length();
		int s = 0;
		
		for(int i = 0; i < len; i++) {
			switch (input.charAt(i)) {
				case 'A' : case 'B' : case 'C' : 
					s+=3;
					break;
				case 'D' : case 'E' : case 'F' : 
					s+=4;
					break;
				case 'G' : case 'H' : case 'I' : 
					s+=5;
					break;
				case 'J' : case 'K' : case 'L' : 
					s+=6;
					break;
				case 'M' : case 'N' : case 'O' : 
					s+=7;
					break;
				case 'P' : case 'Q' : case 'R' : case 'S' : 
					s+=8;
					break;
				case 'T' : case 'U' : case 'V' : 
					s+=9;
					break;
				case 'W' : case 'X' : case 'Y' : case 'Z' : 
					s+=10;
					break;
			}
		}
		System.out.println(s);
	}
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chars = sc.nextLine().toCharArray();

        // 대문자 + 32 -> 소문자
        // 소문자 - 32 -> 대문자
        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 'a' && chars[i] <= 'z') {
                System.out.print((char)(chars[i] - 32));
            } else {
                System.out.print((char)(chars[i] + 32));
            }
        }
    }
}
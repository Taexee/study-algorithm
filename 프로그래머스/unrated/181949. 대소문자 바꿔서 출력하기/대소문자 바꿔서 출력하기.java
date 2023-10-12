import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String answer = "";

        for (char tmp : a.toCharArray()) {
            if(Character.isUpperCase(tmp)) { // 대문자일 경우
                answer += Character.toLowerCase(tmp);
            } else { // 소문자일 경우
                answer += Character.toUpperCase(tmp);
            }
        }

        System.out.println(answer);
    }
}
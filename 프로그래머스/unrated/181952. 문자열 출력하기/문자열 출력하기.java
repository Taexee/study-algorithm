import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        if(a.length() >= 1 && a.length() <= 1000000) {
            System.out.println(a);
        } else {
            System.out.println("다시 입력");
        }
    }
}
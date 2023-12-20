import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt(); // 방학일수
        int a = sc.nextInt(); // 국어
        int b = sc.nextInt(); // 수학
        int c = sc.nextInt(); // 국어 최대 페이지
        int d = sc.nextInt(); // 수학 최대 페이지

        int aDay = a%c != 0 ? a/c + 1 : a/c;
        int bDay = b%d != 0 ? b/d + 1 : b/d;

        System.out.println(l - Math.max(aDay, bDay));
    }
}
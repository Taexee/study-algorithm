import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 시
        int b = sc.nextInt(); // 분
        int c = sc.nextInt(); // 초
        int d = sc.nextInt(); // 필요한 시간

        c += d;
        if(c > 59) {
            b += c/60;
            c %= 60;
        }
        if(b > 59) {
            a += b/60;
            b %= 60;
        }
        if(a > 23) {
            a %= 24;
        }

        System.out.printf("%d %d %d", a, b, c);

    }
}

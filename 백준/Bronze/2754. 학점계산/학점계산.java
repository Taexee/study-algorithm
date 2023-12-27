import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        double grade = 0;  //학점
        char c = s.charAt(0);
        if (c == 'A') {
            grade = 4;
        } else if (c == 'B') {
            grade = 3;
        } else if (c == 'C') {
            grade = 2;
        } else if (c == 'D') {
            grade = 1;
        } else {
            System.out.print("0.0");
            return;
        }
        c = s.charAt(1);
        if (c == '+') {
            grade += 0.3;
        } else if (c == '-') {
            grade -= 0.3;
        }
        System.out.print(grade);
    }
}

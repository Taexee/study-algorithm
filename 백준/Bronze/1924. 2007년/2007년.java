import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int days = 0;
        for(int i = 0; i < x-1; i++) {
            days += month[i];
        }
        days += y;
        System.out.println(day[days%7]);
    }
}
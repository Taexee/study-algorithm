import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();

        if(t % 10 != 0) {
            System.out.println(-1);
        } else {
            int a = t / 300;
            t %= 300;
            int b = t / 60;
            t %= 60;
            int c = t / 10;
            System.out.println(String.format("%d %d %d", a, b, c));
        }

    }
}

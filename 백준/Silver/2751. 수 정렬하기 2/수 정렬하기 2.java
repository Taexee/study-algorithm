import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            a.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(a);

        StringBuilder sb = new StringBuilder();
        for(int num : a) {
            sb.append(num).append('\n');
        }

        System.out.println(sb);
    }
}
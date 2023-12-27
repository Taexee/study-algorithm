import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Stack<Integer> s = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();

            switch (a) {
                case "push":
                    s.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(s.isEmpty() ? "-1" : s.pop()).append("\n");
                    break;
                case "size":
                    sb.append(s.size()).append("\n");
                    break;
                case "empty":
                    sb.append(s.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "top":
                    sb.append(s.isEmpty() ? "-1" : s.peek()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}

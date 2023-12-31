import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int b = 0; // 큐 가장 뒤 원소 확인용

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();

            switch (a) {
                case "push":
                    b = Integer.parseInt(st.nextToken());
                    q.offer(b);
                    break;
                case "pop":
                    sb.append(q.isEmpty() ? "-1\n" : q.remove() + "\n");
                    break;
                case "size":
                    sb.append(q.size() + "\n");
                    break;
                case "empty":
                    sb.append(q.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    sb.append(q.isEmpty() ? "-1\n" : q.peek() + "\n");
                    break;
                case "back":
                    sb.append(q.isEmpty() ? "-1\n" : b + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}

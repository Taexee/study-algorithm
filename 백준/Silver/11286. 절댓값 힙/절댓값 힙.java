import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 연산 개수

        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            // 우선 순위 정렬기준 정의
            int firstAbs = Math.abs(o1);
            int secondAbs = Math.abs(o2);

            // 절대값이 같은 경우 음수 우선
            if(firstAbs == secondAbs) {
                return o1 > o2 ? 1 : -1;
            }

            // 절대값이 최소인 값 우선
            return firstAbs - secondAbs;
        });

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                if(q.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(q.poll());
                }
            } else {
                q.add(num);
            }
        }

    }
}
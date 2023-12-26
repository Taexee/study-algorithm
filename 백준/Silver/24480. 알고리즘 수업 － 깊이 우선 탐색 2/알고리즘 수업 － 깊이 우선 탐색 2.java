import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static boolean[] vistited; // 방문 배열
    static ArrayList<ArrayList<Integer>> graph; // 그래프
    static int[] seq; // 방문 순서
    static int count = 1; // 탐색 순서

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 정점 수
        int m = Integer.parseInt(st.nextToken()); // 간선 수
        int r = Integer.parseInt(st.nextToken()); // 시작 정점

        vistited = new boolean[n+1]; // 방문 배열 초기화
        seq = new int[n+1]; // 방문 순서 배열 초기화
        graph = new ArrayList<>(); // 그래프 초기화
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }

        // 그래프 데이터 저장
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 무뱡향이기 때문에 양방행 모두 저장
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 내림차순 정렬
        for(int i = 0; i <= n; i++){
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        // dfs 탐색
        seq[r] = count++;
        vistited[r] = true;
        DFS(r);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(seq[i] + "\n");
        }

        System.out.println(sb);

    }

    private static void DFS(int n) {
        for(int i : graph.get(n)){
            if(!vistited[i]) {
                vistited[i] = true; // 방문 배열 true
                seq[i] = count++;
                DFS(i);
            }
        }
    }
}

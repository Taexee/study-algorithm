import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean visited[]; // 방문 배열
    static ArrayList<Integer>[] a; // 인접 리스트
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 노드 개수
        int m = Integer.parseInt(st.nextToken()); // 엣지 개수

        visited = new boolean[n+1];
        a = new ArrayList[n+1];

        // 인접 리스트 데이터
        for(int i = 1; i < n+1; i++) {
            a[i] = new ArrayList<>();
        }

        // 인접 리스트 데이터 저장
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // 시작
            int e = Integer.parseInt(st.nextToken()); // 종료

            // 무방향이기 때문에 양방향 저장
            a[s].add(e);
            a[e].add(s);
        }

        int count = 0; // 연결 요소 개수

        // 방문하지 않은 노드가 있으면 count++, DFS()함수 호출
        for(int i = 1; i < n+1; i++){
            if(!visited[i]) {
                count++;
                DFS(i);
            }
        }

        System.out.println(count);

    }

    private static void DFS(int n) {
        if(visited[n]) return; // 방문한 노드이면 탐색하지 않음

        // 방문하지 않은 노드면 방문
        visited[n] = true;

        // 현재 노드 n의 인접 리스트에서 방문하지 않는 노드 방문
        for(int i : a[n]) {
            if(!visited[i]) DFS(i);
        }
    }
}

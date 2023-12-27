import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    // 상하좌우를 탐색하기 위한 define값 정의
    // 아래, 오른쪽, 위, 왼쪽 탐색의미
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] a; // 미로 데이터
    static int n, m; // n-row m-column

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n][m];

        // 미로 데이터 초기화, 저장
        a = new int[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            for(int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(s.substring(j, j+1));
            }
        }
        
        BFS(0,0);

        System.out.println(a[n-1][m-1]);

    }

    private static void BFS(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {i, j});
        visited[i][j] = true;
        while (!q.isEmpty()) {
            int now[] = q.poll();

            // 상하좌우 탐색
            for(int k = 0; k < 4; k++){
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if(x >= 0 && y >= 0 && x < n && y < m) { // 배열을 넘어가면 안됨
                    if(a[x][y] != 0 && !visited[x][y]) { // 0이어서 갈수없고 방문한 곳이면 안됨
                        // 탐색 가능
                        visited[x][y] = true;
                        a[x][y] = a[now[0]][now[1]] + 1; // 깊이로 변경
                        q.add(new int[] {x, y});
                    }
                }
            }
        }
    }
}

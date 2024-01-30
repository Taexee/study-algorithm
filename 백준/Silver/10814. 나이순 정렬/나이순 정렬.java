import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String[][] a = new String[n][2];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            a[i][0] = st.nextToken();
            a[i][1] = st.nextToken();
        }

        Arrays.sort(a, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i  = 0; i < n; i++){
            System.out.println(a[i][0]+" "+a[i][1]);
        }

    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] a = new String[n];

        for(int i = 0; i < n; i++) {
            a[i] = br.readLine();
        }

        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 사전순 정렬
                } else {
                    return o1.length() - o2.length(); // 길이
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(a[0]).append('\n');
        for(int i = 1; i < n; i++) {
            if(!a[i].equals(a[i-1])) {
                sb.append(a[i]).append('\n');
            }
        }

        System.out.println(sb);
    }
}
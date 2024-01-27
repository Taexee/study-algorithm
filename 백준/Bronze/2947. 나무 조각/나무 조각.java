import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[5];

        for(int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        boolean check = true;
        while (check) {
            check = false;
            for(int i = 1; i < 5; i++) {
                if(a[i-1] > a[i]) {
                    check = true;
                    int tmp = a[i-1];
                    a[i-1] = a[i];
                    a[i] = tmp;
                    for(int num : a) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            }
        }

    }
}
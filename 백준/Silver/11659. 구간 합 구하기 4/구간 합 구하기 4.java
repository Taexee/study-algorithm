import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[] array;

        st=new StringTokenizer(br.readLine());
        array=new int[n+1];
        for(int i=1;i<=n;i++) { // 합배열
            array[i]=array[i-1]+Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<m;i++) {
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            // 구간 합
            System.out.println(array[b]-array[a-1]);
        }
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(a + b) + "\n" );
        bw.write(String.valueOf(a - b) + "\n");
        bw.write(String.valueOf(a * b) + "\n");
        bw.write(String.valueOf(a / b) + "\n");
        bw.write(String.valueOf(a % b));
        bw.flush();
        bw.close();
    }
}
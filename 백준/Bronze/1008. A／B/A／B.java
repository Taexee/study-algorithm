import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		Double n = Double.parseDouble(st.nextToken());
		Double m = Double.parseDouble(st.nextToken());
		System.out.print(n/m);
	}
}
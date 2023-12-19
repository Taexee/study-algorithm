import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 수열 개수

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuffer bf = new StringBuffer();
        Stack<Integer> s = new Stack<>();
        int num = 1; // 오름차순 자연수
        boolean result = true;
        for(int i = 0; i < arr.length; i++) {
            int arrNum = arr[i];

            if(arrNum >= num) { // 현재 수 >= 오름차순 수
                while (arrNum >= num){ // 같아질 때까지 스택에 넣어준다
                    s.push(num++);
                    bf.append("+\n");
                }
                s.pop(); // 현재 수열 꺼내기
                bf.append("-\n");
            } else {
                int sNum = s.pop();
                if(sNum > arrNum) { // 오름차순으로 불가
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if(result) {
            System.out.println(bf.toString());
        }
    }
}
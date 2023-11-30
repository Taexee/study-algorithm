import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        for(int num : arr){
            if(num % divisor == 0) cnt++;
        }

        int[] answer = cnt == 0 ? new int[]{-1} : new int[cnt];

        int idx = 0;
        for(int n : arr){
            if (n % divisor == 0) answer[idx++] = n;
        }
        Arrays.sort(answer);
        return answer;
    }
}
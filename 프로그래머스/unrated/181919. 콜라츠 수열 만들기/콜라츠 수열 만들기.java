import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> result = new ArrayList();
        result.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if(n % 2 <= 1){
                n = 3 * n + 1;
            }
            result.add(n);

        }
        int[] answer = new int[result.size()];
        for(int i  = 0; i < answer.length; i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}
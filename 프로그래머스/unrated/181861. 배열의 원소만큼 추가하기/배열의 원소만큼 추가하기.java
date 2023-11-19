import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> num = new ArrayList<>();

        for(int n : arr){
            for (int i = 1; i <= n; i++){
                num.add(n);
            }
        }
        int[] answer = new int[num.size()];
        for(int i = 0; i < num.size(); i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}
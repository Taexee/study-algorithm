import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        int i = 2;
        ArrayList<Integer> arr = new ArrayList<>();
       while (n != 1) {
           if(n % i == 0) {
               n /= i;
               if(!arr.contains(i)) arr.add(i);
           } else {
               i++;
           }
       }
        int[] answer = new int[arr.size()];
        for(int j = 0; j < answer.length; j++){
            answer[j] = arr.get(j);
        }
        return answer;
    }
}
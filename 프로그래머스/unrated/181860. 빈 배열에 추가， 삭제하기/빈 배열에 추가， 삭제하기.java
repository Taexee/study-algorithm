import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int idx = 0;
        List<Integer> array = new ArrayList<>();
        for(boolean f : flag){
            if(f) {
                for (int i = 0; i < arr[idx]*2; i++) {
                    array.add(arr[idx]);
                }
            } else {
                for (int i = 0; i < arr[idx]; i++) {
                    array.remove(array.size()-1);
                }
            }
            idx++;
        }
        int[] answer = new int[array.size()];
        for(int i = 0; i < array.size(); i++){
            answer[i] = array.get(i);
        }
        return answer;
    }
}
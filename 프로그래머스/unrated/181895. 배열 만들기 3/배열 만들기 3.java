import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int[] num : intervals){
            int start = num[0];
            int end = num[1];
            for(int i = start; i <= end; i++){
                array.add(arr[i]);
            }
        }
        int[] answer = new int[array.size()];
        for(int i = 0; i< array.size(); i++){
            answer[i] = array.get(i);
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(String my_string) {
         my_string = my_string.replaceAll("[^0-9]","");

        String[] numbers = my_string.split("");
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            answer[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}
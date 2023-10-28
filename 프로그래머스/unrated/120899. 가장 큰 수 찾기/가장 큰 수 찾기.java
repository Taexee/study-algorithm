import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int max = 0;
        for(int i = 0; i < array.length; i++){

            if(array[i] >= max) {
                max = array[i];
                answer[1] = i;
            }
            System.out.println(array[i] +" "+ max);
        }
        Arrays.sort(array);

        answer[0] = array[array.length-1];
        
        return answer;
    }
}
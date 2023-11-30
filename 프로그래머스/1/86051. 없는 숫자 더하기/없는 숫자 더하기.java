class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int max = 45;
        int sum = 0;

        for(int n : numbers){
            sum += n;
        }
        answer = max - sum;
        return answer;
    }
}
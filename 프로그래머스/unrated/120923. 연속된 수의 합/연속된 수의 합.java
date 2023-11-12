class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int init = total/num - (num-1)/2;
        for(int i = 0; i < num; i++){
            answer[i] = init;
            init++;
        }
        return answer;
    }
}
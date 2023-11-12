class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int idx = 0;
        for(int j = 1; j <= n; j++){
            if(j%k == 0) answer[idx++] = j;
        }
        return answer;
    }
}
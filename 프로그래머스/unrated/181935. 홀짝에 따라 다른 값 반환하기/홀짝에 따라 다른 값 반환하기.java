class Solution {
    public int solution(int n) {
        int answer = 0;
        // 홀수 + 홀수 => 홀수끼리 합
        // 짝수 = 짝수 => 짝수끼리 제곱
        for(int i = 1; i <= n; i++) {
            if(i%2 == 1 && n%2 == 1) {
                answer += i;
            } else if(i%2 == 0 && n%2 == 0){
                answer += Math.pow(i,2);
            }
        }
        return answer;
    }
}
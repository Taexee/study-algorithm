class Solution {
    public int solution(int n) {
        int answer = 0;
        // 두 숫자의 곱이 n인 자연수 순서쌍의 개수
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) answer++;
        }
        return answer;
    }
}
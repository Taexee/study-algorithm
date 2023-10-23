class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i =1; i <= n; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0) count++; // 약수면 +1
            }
            if(count >= 3) answer++; // 약수 3개 이상이면 +1
        }

        return answer;
    }
}
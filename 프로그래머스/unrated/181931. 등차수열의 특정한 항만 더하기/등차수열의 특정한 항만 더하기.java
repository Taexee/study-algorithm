class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        // 등차수열 a + (n-1)b
        for(int i = 0; i < included.length; i++){
            answer += included[i] == true? a+(d*i) : 0;
        }
        return answer;
    }
}
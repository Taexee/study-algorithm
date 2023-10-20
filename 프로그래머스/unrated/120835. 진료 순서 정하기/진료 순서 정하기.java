class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        // 높을수록 응급도 높음
        // 3, 1, 2 출력
        for(int i = 0; i < emergency.length; i++) {
            answer[i]++; // 순서 1부터 시작 모두 1 더해줌
            for(int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j])
                    answer[i]++;
            }
        }
        return answer;
    }
}
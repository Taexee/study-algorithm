class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                //answer[cnt] = i;
                cnt++;
            }
        }

        answer = new int[cnt];

        cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[cnt] = i;
                cnt++;
            }
        }

        return answer;
    }
}
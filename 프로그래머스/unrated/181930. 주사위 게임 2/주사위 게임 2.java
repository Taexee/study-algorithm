class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;

        // 모두 다르면 a+b+c
        // 두 숫자 같음 (a+b+c)*(a^2+b^2+c^2)
        // 모두 같음 (a+b+c)*(a^2+b^2+c^2)*(a^3+b^3+c^3)

        if(a == b && a == c) {
            for(int i = 1; i <= 3; i++){
                answer *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
            }
        } else if (a == b || b == c || c == a) {
            for(int i = 1; i <= 2; i++){
                answer *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
            }
        } else {
            answer = a + b + c;
        }
        return answer;
    }
}
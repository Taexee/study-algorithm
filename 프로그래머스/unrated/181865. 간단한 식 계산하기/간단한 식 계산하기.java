class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] s = binomial.split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[2]);
        String op = s[1];

        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else if (op.equals("*")) {
            answer = a * b;
        }
        return answer;
    }
}
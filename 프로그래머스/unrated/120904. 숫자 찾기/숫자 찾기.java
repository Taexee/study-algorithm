class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numstr = Integer.toString(num);
        String kstr = Integer.toString(k);

        answer = numstr.indexOf(kstr);
        return answer == -1 ? answer : ++answer;
    }
}
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for(int i = 0; i < s1.length; i++) {
            for (String s : s2) {
                if(s1[i].equals(s)) answer++;
            }
        }
        return answer;
    }
}
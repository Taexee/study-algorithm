class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String subStr = my_string.substring(s, e+1);
        StringBuilder sb = new StringBuilder();
        sb.append(subStr);
        sb.reverse();

        answer = my_string.replace(subStr, sb);
        return answer;
    }
}
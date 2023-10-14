class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int c = str1.length();
        for(int i = 0; i < c; i++){
            answer += String.valueOf(str1.charAt(i)) + str2.charAt(i);
        }
        return answer;
    }
}
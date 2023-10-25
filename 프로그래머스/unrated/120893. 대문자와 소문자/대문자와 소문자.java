class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            answer += Character.isUpperCase(my_string.charAt(i)) ? Character.toLowerCase(my_string.charAt(i)) : Character.toUpperCase(my_string.charAt(i));
        }
        return answer;
    }
}
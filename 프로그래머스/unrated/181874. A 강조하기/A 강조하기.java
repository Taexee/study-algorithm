class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] str = myString.split("");

        for(String s : str){
            if(s.equals("a") || s.equals("A")) answer += s.toUpperCase();
            else answer += s.toLowerCase();
        }
        return answer;
    }
}
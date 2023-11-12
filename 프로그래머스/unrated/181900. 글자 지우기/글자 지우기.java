class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str = my_string.split("");

        for(int i : indices){
            str[i] = "";
        }
        for(String s : str){
            answer += s;
        }
        return answer;
    }
}
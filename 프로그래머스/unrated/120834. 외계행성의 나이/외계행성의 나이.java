class Solution {
    public String solution(int age) {
        String answer = "";
        String[] split = String.valueOf(age).split("");
        for(int i =0; i < split.length; i++){
            answer += (char)(Integer.parseInt(split[i]) + 97);
        }
        return answer;
    }
}
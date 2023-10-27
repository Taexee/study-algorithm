class Solution {
    public String solution(String s) {
        String answer = "";
        int[] count = new int[26];

        for(int i =0; i < s.length(); i++){
            count[s.charAt(i) - 97]++;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] == 1){
                answer += (char)(i+97);
            }
        }
        
        return answer;
    }
}
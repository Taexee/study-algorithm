class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i) == '1') {
                // 0인 경우 1-0 = 1
                // 1인 경우 1-1 = 0
                mode = 1 - mode;
            } else if(i%2 == mode) {
                answer += code.charAt(i);
            }
        }
        return "".equals(answer) ? "EMPTY" : answer;
    }
}
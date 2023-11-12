class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = {"aya", "ye", "woo", "ma"};
        for(String s : babbling){
            for(String b : baby){
                // 포함되어있으면 공백처리
                s = s.replace(b, " ");
            }
            if(s.replaceAll(" ", "").equals((""))){
                answer++;
            }
        }
        return answer;
    }
}
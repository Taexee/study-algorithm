class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(String nstr : num_str.split("")){
            answer+=Integer.parseInt(nstr);
        }
        return answer;
    }
}
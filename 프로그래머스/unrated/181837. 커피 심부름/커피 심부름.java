class Solution {
    public int solution(String[] order) {
        int answer = 0;
        // 아메 4500 라떼 5000 아무거나 아메
        for(String s : order){
            answer += s.contains("cafelatte") ? 5000 : 4500;
        }
        return answer;
    }
}
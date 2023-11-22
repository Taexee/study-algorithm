class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[31];

        for(int i = 0; i < strArr.length; i++){
            count[strArr[i].length()]++;
        }
        
        for(int cnt : count){
            if(cnt > answer) answer = cnt;
        }
        return answer;
    }
}
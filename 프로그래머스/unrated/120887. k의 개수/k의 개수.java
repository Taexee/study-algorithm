class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a = i; a <= j; a++){
            String s = String.valueOf(a);
            String[] nums = s.split("");
            for(String num : nums){
                if(num.contains(String.valueOf(k))) answer++;
            }
        }
        return answer;
    }
}
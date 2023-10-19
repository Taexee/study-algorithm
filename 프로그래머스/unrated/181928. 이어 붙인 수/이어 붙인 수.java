class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String add = "";
        String even = "";

        for(int num : num_list) {
            if(num%2 == 0) {
                even += String.valueOf(num);
            } else {
                add += String.valueOf(num);
            }
        }
        answer = Integer.parseInt(add) + Integer.parseInt(even);
        return answer;
    }
}
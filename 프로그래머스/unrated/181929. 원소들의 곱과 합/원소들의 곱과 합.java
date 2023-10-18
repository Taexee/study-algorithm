class Solution {
    public int solution(int[] num_list) {
        // 원소곱, 원소 합의 제곱
        int a = 1;
        int b = 0;
        
        // 코드 중복 제거
        for(int i = 0; i < num_list.length; i++){
            a *= num_list[i];
            b += num_list[i];
        }
        return a > b*b ? 0 : 1;
    }
}
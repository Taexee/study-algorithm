class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        int idx = 0;
        if(k%2 == 1){
            for(int n : arr){
                answer[idx++] = n*k;
            }
        } else {
            for(int n : arr){
                answer[idx++] = n+k;
            }
        }
        return answer;
    }
}
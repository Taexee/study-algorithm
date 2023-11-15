class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[1];

        int start = -1;
        int end = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2) {
                start = i;
                break;
            }
        }
        if(start >= 0) {
            for(int i = start+1; i < arr.length; i++){
                if(arr[i] == 2) {
                    end = i;
                }
            }
        }

        System.out.println("start = " + start + ", end = " + end);

        if(start == -1){
            answer[0] = -1;
        } else if(start > end) {
            answer[0] = 2;
        } else {
            answer = new int[end - start + 1];
            int idx = 0;
            for(int i = start; i <= end; i++){
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}
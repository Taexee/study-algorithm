class Solution {
    public int[] solution(int[] arr) {
        int arrLen = arr.length;;
        int pow = 0;
        while (arrLen > Math.pow(2, pow)) {
            pow++;
        }

        int[] answer = new int[(int)Math.pow(2, pow)];
        for(int i = 0; i < arrLen; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}
class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        answer = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
            answer[arr.length-1-i] = str.charAt(i)-'0';
            System.out.print(answer[arr.length-1-i] + " ");
        }

        return answer;
    }
}
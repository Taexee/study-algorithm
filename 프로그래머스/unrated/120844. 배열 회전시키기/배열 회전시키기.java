class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(direction.equals("right")) {
            answer[0] = numbers[numbers.length-1]; //3
            for(int i = 0; i < numbers.length-1; i++){
                answer[i+1] = numbers[i];
            }
        } else if (direction.equals("left")){
            int tmp = numbers[0];
            for(int i = 0; i < numbers.length-1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[numbers.length-1] = tmp;
        }
        return answer;
    }
}
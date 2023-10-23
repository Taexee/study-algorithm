class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] numbers = number.split("");
        for(int i = 0; i < numbers.length; i++){
            answer += Integer.parseInt(numbers[i]);
        }
        return answer % 9;
    }
}
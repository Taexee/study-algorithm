class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]","");

        String[] numbers = my_string.split("");
        for(int i = 0; i < numbers.length; i++){
            answer += Integer.parseInt(numbers[i]);
        }
        return answer;
    }
}
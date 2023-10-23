class Solution {
    public int solution(int[] numbers, int k) {
        // k번 2씩 증가 1부터 시작
        return numbers[2*(k-1) % numbers.length];
    }
}
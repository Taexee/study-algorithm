class Solution {
    public int solution(int hp) {
        int answer = 0;
        // 장군 5 병정 3 일개미 1
        int general = 5;
        int soldier = 3;
        int ant = 1;
        answer += hp/general;
        answer += (hp%general)/soldier;
        answer += (hp%general)%soldier;
        return answer;
    }
}
class Solution {
    public int solution(int[] sides) {
        int big = Math.max(sides[0], sides[1]);
        int small = Math.min(sides[0], sides[1]);

        int low = big - small;
        int high = big + small;

        return high - low - 1;
    }
}

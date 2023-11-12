class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            int restCoupon = coupon % 10;
            answer += coupon / 10;
            coupon = restCoupon + coupon / 10;
        }

        return answer;
    }
}
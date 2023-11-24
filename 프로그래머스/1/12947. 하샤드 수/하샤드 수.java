class Solution {
    public boolean solution(int x) {
        int tmp = x;
        int sum = 0;

        while (tmp > 0) {
            sum += tmp%10;
            if(tmp < 0) break;
            tmp /= 10;
        }

        return x%sum == 0? true : false;
    }
}
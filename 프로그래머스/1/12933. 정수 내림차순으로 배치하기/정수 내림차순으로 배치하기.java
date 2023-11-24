import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        String[] str = s.split("");
        Arrays.sort(str);
        String tmp = "";

        for(int i = str.length-1; i >= 0; i--){
            tmp += str[i];
        }

        answer = Long.parseLong(tmp);
        return answer;
    }
}
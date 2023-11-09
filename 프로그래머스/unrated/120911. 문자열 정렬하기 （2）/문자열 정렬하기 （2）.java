import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer ="";
        String[] str = my_string.toLowerCase().split("");
        Arrays.sort(str);

        for(String s : str){
            answer += s;
        }
        
        return answer;
    }
}
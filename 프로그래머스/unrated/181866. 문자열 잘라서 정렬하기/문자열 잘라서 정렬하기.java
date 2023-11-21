import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        Arrays.sort(str);
        List<String> arr = new ArrayList<>();
        for(int i = 0; i < str.length; i++){
            if(!str[i].isEmpty()) arr.add(str[i]);
        }
        String[] answer = arr.toArray(new String[0]);

        return answer;
    }
}
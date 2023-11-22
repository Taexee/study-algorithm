import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] split = myStr.split("[a-c]");

        List<String> list = new ArrayList<>();
        if (split.length == 0) {
            list.add("EMPTY");
        } else {
            for(String str : split) {
                if(!str.isEmpty()){
                    list.add(str);
                }
            }
        }

        String[] answer  = list.toArray(new String[0]);
        return answer;
    }
}
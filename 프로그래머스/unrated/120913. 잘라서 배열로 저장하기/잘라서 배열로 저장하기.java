import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0; i < my_str.length()/n; i++){
            arr.add(my_str.substring(i*n, (i+1)*n));
        }
        if(my_str.length()%n > 0) {
            arr.add(my_str.substring((my_str.length()/n)*n));
        }

        return arr.toArray(new String[arr.size()]);
   
    }
}
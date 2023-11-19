class Solution {
    public int solution(String myString, String pat) {

        if(myString.length() >= pat.length()){
            return myString.toLowerCase().contains(pat.toLowerCase())? 1: 0;
        } else {
            return 0;
        }
    }
}
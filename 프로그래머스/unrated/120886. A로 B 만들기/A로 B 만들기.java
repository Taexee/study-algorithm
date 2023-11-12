class Solution {
    public int solution(String before, String after) {
        int beforeSum = 0;
        int afterSum = 0;
        for(int i = 0; i < before.length(); i++){
            beforeSum += before.charAt(i);
            afterSum += after.charAt(i);
        }
        return beforeSum == afterSum? 1 : 0;
    }
}
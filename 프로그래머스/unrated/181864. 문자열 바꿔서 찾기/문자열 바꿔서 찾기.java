class Solution {
    public int solution(String myString, String pat) {
        String newStr = myString.replace('A', 'b').replace('B', 'a').toUpperCase();
        System.out.println(newStr);
        return newStr.contains(pat)? 1:0;
    }
}
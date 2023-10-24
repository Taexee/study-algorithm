class Solution {
    public String solution(String my_string) {
        String[] vowel = {"a", "e", "i", "o", "u"};
        for(int i = 0; i < vowel.length; i++){
            if(my_string.contains(vowel[i])){
                my_string = my_string.replace(vowel[i], "");
            }
        }
        return my_string;
    }
}
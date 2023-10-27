class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] array = my_string.toCharArray();

        array[num1] = my_string.charAt(num2);
        array[num2] = my_string.charAt(num1);

        return String.valueOf(array);
    }
}
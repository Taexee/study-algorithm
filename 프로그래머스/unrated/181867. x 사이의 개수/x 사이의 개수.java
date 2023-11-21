class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        int[] answer = myString.charAt(myString.length()-1) == 'x' ? new int[str.length+1] : new int[str.length];

        for(int i = 0; i< str.length; i++){
            System.out.println(str[i]);
            answer[i] = str[i].length();
        }
        return answer;
    }
}
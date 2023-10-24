import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] s1 = s.split(" ");
        Stack<Integer> numbers = new Stack<>();
        for(int i = 0; i < s1.length; i++){
            if(!s1[i].equals("Z")){
                numbers.push(Integer.parseInt(s1[i]));
            } else {
                System.out.println(i+" "+s1[i]);
                if(numbers.size() >= 1){
                    numbers.pop();
                }
            }
        }

        for (int i = 0; i < numbers.size(); i++){
            answer+=numbers.get(i);
        }
        return answer;
    }
}
class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] r = rsp.split("");
        for(String a : r){
            if(a.equals("2")) answer+= "0";
            else if (a.equals("0")) answer+="5";
            else if (a.equals("5")) answer+="2";
        }
        return answer;
    }
}
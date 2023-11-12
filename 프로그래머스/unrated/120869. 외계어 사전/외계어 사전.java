class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i = 0; i < dic.length; i++){
            int count = 0;
            for(String str : spell){
                if(dic[i].contains(str)) count++;
            }
            if(count == spell.length) answer = 1;
        }
        return answer;
    }
}
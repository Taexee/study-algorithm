class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(int i = 0; i < db.length; i++){

            if(db[i][0].equals(id_pw[0])){
                
                answer = db[i][1].equals(id_pw[1])? "login" : "wrong pw";
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i%2 == 1) even += num_list[i];
            else odd += num_list[i];
        }
        
        if(odd > even || odd == even) return odd;
        else return even;
    
    }
}
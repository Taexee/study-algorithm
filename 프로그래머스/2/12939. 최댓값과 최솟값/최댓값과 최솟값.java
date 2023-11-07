class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        for(String str : arr){
            int i = Integer.parseInt(str);
            if(i> max) max = i;
            if(i<min) min = i;
        }

        return min + " " + max;
    }
}
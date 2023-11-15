class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int sumArr1 = 0;
        int sumArr2 = 0;

        for(int n : arr1){
            sumArr1 += n;
        }

        for(int n : arr2){
            sumArr2 += n;
        }

        if(arr1.length > arr2.length || arr1.length == arr2.length && sumArr1 > sumArr2) answer = 1;
        else if (arr1.length < arr2.length || arr1.length == arr2.length && sumArr1 < sumArr2) answer = -1;
        else if (arr1.length == arr2.length && sumArr1 == sumArr2) answer = 0;
        
        return answer;
    }
}
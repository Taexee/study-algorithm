class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int column= arr[0].length;
        int[][] answer = column >= row ? new int[column][column] : new int[row][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}
// Question => https://leetcode.com/problems/search-a-2d-matrix/submissions/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean isFound = false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == target){
                    isFound = true;
                }
            }
        }
        return isFound;
    }
}
// Time complexity => O(n^2)

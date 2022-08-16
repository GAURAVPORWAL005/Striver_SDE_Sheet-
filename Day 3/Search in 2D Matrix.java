Koi// Question => https://leetcode.com/problems/search-a-2d-matrix/submissions/

// Brute force Approach
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

// Optimized Approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0; int j = matrix[0].length-1;
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }
            if(target < matrix[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}

// Time complexity => O(n)
// space complexity => O(n)

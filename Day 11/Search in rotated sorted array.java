// Quesiton => https://leetcode.com/problems/search-in-rotated-sorted-array/
// Brute Force Approach
class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
// Time complexity => O(n)

// Optimized Approach using binary search

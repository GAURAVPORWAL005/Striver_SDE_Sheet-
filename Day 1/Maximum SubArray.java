// Question => https://leetcode.com/problems/maximum-subarray/
// Brute force approach
class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;                                                                                                                                
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                
                 ans = Math.max(ans,sum);
            }
        }
        return ans;
    }
}
// TIme complexity => O(n^2)



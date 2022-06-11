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

// Optimized Appraoch

// Kadane Algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
// Time complexity => O(n)



// Question => https://leetcode.com/problems/majority-element/submissions/
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

// Time complexity => O(logn)

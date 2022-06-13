// Question => https://leetcode.com/problems/two-sum/submissions/
class Solution {
    int[] result = new int[2];
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
        
    }
}

// Time complexity => O(n^2)

// Optimized Approach
// if hashmap contains target - nums[i] value than return it otherwise add the nums[i] to the haspmap along with the index.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}

// Time Complexity => O(n)

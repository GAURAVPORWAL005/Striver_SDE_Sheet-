// Question => https://www.interviewbit.com/problems/subarray-with-given-xor/
// Brute force Approach
public class Solution {
    public int solve(int[] A, int B) {
        int c = 0;
        for(int i=0;i<A.length;i++){
            int current_xor = 0;
            for(int j = i;j<A.length;j++){
                current_xor^= A[j];
                if(current_xor == B){
                    c++;
                }
            }
        }
        return c;
    }
}
// Time complexity => O(n^2)

class Solution {
    public int missingNumber(int[] nums) {
        //bit wise xor
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            res=res^nums[i]^i;
            
        }
        return res^n;
    }
}
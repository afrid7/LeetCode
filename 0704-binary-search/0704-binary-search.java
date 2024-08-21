class Solution {
    public int search(int[] nums, int target) {
        int a=nums.length;
        int left=0;
        int right=a-1;
        int mid=0;
            while(left <= right){
                mid=((left+right)/2);
                if(nums[mid]==target){
                    return mid;
                }
                else if(target > nums[mid]){
                    left=mid+1;
                }
                else right=mid-1;
            }
            return -1;
        
        
    }
}
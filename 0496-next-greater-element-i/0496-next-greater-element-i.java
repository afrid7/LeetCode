class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];
        for(int i=0;i<n1;i++){
            boolean found=false;
            ans[i] = -1;
            for(int j=0;j<n2;j++){
                if(nums1[i] == nums2[j]){
                    found = true;
                }
                if(found && nums1[i]<nums2[j]){
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
}
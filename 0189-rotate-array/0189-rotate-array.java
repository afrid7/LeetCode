class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int temp=0;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int []a,int start,int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;        
            start++;
            end--;
        }
    }
}
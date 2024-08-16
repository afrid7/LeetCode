class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=m*n-1;
        while(left<=right){
            int mid=(left+right)/2;
            int r=mid/n;
            int c=mid%n;
            int temp=matrix[r][c];
            if(target==temp){
                return true;
            }
            if(target >temp){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}
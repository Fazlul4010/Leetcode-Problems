class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int r=0;
        int c=m*n-1;

        while(r<=c){
            int mid=r+(c-r)/2;
            int mid_val=matrix[mid/n][mid%n];

            if(mid_val==target)
                return true;
            else if (mid_val<target)
                r=mid+1;
            else
                c=mid-1;
            
        }
        return false;
    }
}
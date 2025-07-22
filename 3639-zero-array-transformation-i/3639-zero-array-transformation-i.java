class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] v = new int[n + 1];

        for(int[]q:queries){
            v[q[0]]++;
            if(q[1]+1<v.length){
                v[q[1]+1]--;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum += v[i];
            if(nums[i]<=sum){
                nums[i]=0;
            }else{
                return false;
            }
        }
        return true;
    }
}
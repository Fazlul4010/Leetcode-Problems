class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] res=new int [nums.length];
        int rev=0;
        for(int num:nums){
            if(num%2==0){
                res[rev++]=num;
            }
        }
        for(int num:nums){
            if(num%2!=0){
                res[rev++]=num;
            }
        }
        return res;
    }
}
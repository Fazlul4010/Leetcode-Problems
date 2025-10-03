class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int stop=nums.length-1;

        while(start<=stop){
            int mid=start+(stop-start)/2;
            if(target<nums[mid]){
                stop=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
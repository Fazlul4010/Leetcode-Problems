class Solution {
    public int[] searchRange(int[] nums, int target){
        int[] ans={-1,-1};

        int start=search(nums,target,true);
        int stop=search(nums,target,false);

        ans[0]=start;
        ans[1]=stop;

        return ans;
    }
    int search(int[] nums,int target,boolean FSLI){
        int ans=-1;
        int start=0;
        int stop=nums.length-1;

        while(start<=stop){

            int mid=start+(stop-start)/2;

            if(target < nums[mid]){
                stop=mid-1;
            }else if(target > nums[mid]){
                start=mid+1;
            }else{
                ans=mid;

                if(FSLI){
                    stop=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}

// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int first = findBound(nums, target, true);   // Find first index
//         int last = findBound(nums, target, false);  // Find last index
//         return new int[]{first, last};
//     }

//     private int findBound(int[] nums, int target, boolean isFirst) {
//         int start = 0, end = nums.length - 1;
//         int bound = -1;

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (nums[mid] == target) {
//                 bound = mid;
//                 if (isFirst) {
//                     end = mid - 1; // keep searching left
//                 } else {
//                     start = mid + 1; // keep searching right
//                 }
//             } else if (nums[mid] < target) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }

//         return bound;
//     }
// }
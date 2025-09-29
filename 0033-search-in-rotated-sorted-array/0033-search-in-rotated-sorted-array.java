class Solution {
    public int search(int[] arr, int target) {
        if(arr.length==0){
           return -1;
       }
       for (int i = 0; i < arr.length; i++) {
           int element= arr[i];
           if(element==target){
               return i;
           }
       }
       return -1;
   }
}
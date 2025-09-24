class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
         int start=0;
         int stop=letters.length-1;

         while(start<=stop){

            int mid=start+(stop-start)/2;

            if(target<letters[mid]){
                stop=mid-1;
            }else{
                start=mid+1;
            }
            }
         return letters[start%letters.length];
    }
}
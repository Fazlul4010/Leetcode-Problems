/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int e=n;
        while(l<e){
            int mid=l+(e-l)/2;

            if(isBadVersion(mid)){
                e=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}
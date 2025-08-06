class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        int count=0;
        for(int i:digits)
        {
            if(i==9)
            {
                count++;
            }
        }
        if(count==digits.length)
        {
            int result[] = new int[digits.length+1];
            result[0]=1;
            return result;
        }
        else
        {
        int carry=0;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]=digits[i]+1;
                break;
            }
            else
            {
                digits[i]=0;
                carry=1;
            }
        }
        return digits;
        }
    }
}
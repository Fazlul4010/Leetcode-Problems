class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed=s.trim();
        int count = 0;
        for(int i = trimmed.length()-1; i >=0; i--){
            if(trimmed.charAt(i) == ' '){
                return count;
            }
            count++;
        }
        return count;
    }
}
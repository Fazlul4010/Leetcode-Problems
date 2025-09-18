class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        paranThesis(sb,n,0,0,ans);
        return ans;
    }
    private static void paranThesis(StringBuilder sb,int n, int open, int close, List<String> ans){
        if (close ==n){
            ans.add(sb.toString());
            return;
        }
        else{
            if(open < n){
                paranThesis(sb.append("("),n,open+1,close,ans);
                sb.deleteCharAt(sb.length()-1);
            }
            if(close < open){
                paranThesis(sb.append(")"),n,open,close+1,ans);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
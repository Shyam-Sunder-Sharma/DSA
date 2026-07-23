class Solution {
    public int maxDepth(String s) {
        int depmax=0;
        int dep=0;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                dep++;
            }
            else if(s.charAt(i)==')'){
                dep--;
            }
            depmax=Math.max(depmax,dep);
        }
        return depmax;
    }
}
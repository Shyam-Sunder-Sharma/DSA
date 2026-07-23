class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb= new StringBuilder("");
        
        int lc=0;
        for (char c : s.toCharArray()) {
            if( c=='('){
                lc++;
                if (lc>1){
                    sb.append(c);
                }
            }
            else{
                lc--;
                if(lc>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
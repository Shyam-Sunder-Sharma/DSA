class Solution {
    public int lengthOfLastWord(String s) {
    int l=0;
    int p=s.length()-1;
    while(p>=0){
        if(l==0 && s.charAt(p)==' '){
            p--;
        }
        else if(s.charAt(p)==' '){
            break;
        }
        else{
            l++;
            p--;
        }
    }
    return l;
    
    }
}
class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        String neo = "";

        for (int i = 0; i < s.length(); i++) {
            
            int f = i;
            int l = i;

            while (f >= 0 && l < s.length() && s.charAt(f) == s.charAt(l)) {
                f--;
                l++;
            }

            String temp = s.substring(f + 1, l);

            if (temp.length() > neo.length()) {
                neo = temp;
            }

            f = i;
            l = i + 1;

            while (f >= 0 && l < s.length() && s.charAt(f) == s.charAt(l)) {
                f--;
                l++;
            }

            temp = s.substring(f + 1, l);

            if (temp.length() > neo.length()) {
                neo = temp;
            }
        }
        return neo;
    }
}
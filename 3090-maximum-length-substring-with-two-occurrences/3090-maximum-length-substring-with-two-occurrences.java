class Solution {
    public int maximumLengthSubstring(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            hm.put(c, hm.getOrDefault(c, 0) + 1);

            while (hm.get(c) > 2) {
                char leftChar = s.charAt(left);
                hm.put(leftChar, hm.get(leftChar) - 1);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
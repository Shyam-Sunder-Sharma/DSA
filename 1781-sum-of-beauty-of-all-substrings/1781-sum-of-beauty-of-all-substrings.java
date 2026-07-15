class Solution {
    public int beautySum(String s) {

        int sum = 0;
        int n = s.length();

        for (int left = 0; left < n; left++) {

            int[] freq = new int[26];

            for (int right = left; right < n; right++) {

                freq[s.charAt(right) - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                for (int f : freq) {
                    if (f > 0) {
                        max = Math.max(max, f);
                        min = Math.min(min, f);
                    }
                }
                sum += (max - min);
            }
        }
        return sum;
    }
}
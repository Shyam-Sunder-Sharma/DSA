class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            int current = 0;
            int usedDays = 1;

            for (int w : weights) {

                if (current + w > mid) {
                    usedDays++;
                    current = w;
                } else {
                    current += w;
                }
            }

            if (usedDays <= days)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}
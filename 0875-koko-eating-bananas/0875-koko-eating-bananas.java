class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        // Find the maximum pile
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            int hours = 0;

            // Calculate hours needed at speed = mid
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                // Try a smaller speed
                right = mid;
            } else {
                // Need a faster speed
                left = mid + 1;
            }
        }

        return left;
    }
}
class Solution {
    public int findKthPositive(int[] arr, int k) {

        int num = 1;
        int p = 0;

        while (k > 0) {

            if (p < arr.length && arr[p] == num) {
                p++;
            } else {
                k--;
            }

            num++;
        }

        return num - 1;
    }
}
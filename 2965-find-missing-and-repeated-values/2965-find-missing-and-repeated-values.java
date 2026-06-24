class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int c = 0;
        int[] arr = new int[n * n];
        int[] ans = new int[2];
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                arr[c] = grid[i][j];
                c++;
            }
        }
        for (int k = 1; k <= n * n; k++) {
            int count = 0;
            for (int l = 0; l < c; l++) {
                if (k == arr[l]) {
                    count++;
                }
            }
            if (count == 2) {
                ans[0] = k;
            }
            if (count == 0) {
                ans[1] = k; 
            }
        }
        return ans;
    }
}
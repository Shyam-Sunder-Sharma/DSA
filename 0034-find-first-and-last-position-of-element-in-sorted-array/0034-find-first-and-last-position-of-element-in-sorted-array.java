class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};

        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target){
                int l=mid;
                int r=mid;
                while (l > 0 && nums[l - 1] == target) {
                    l--;
                }

                while (r < nums.length - 1 && nums[r + 1] == target) {
                    r++;
                }
                arr[0]=l;
                arr[1]=r;
                return arr;

            }
            else if(nums[mid]>target) {
                right=mid-1;
            }else{
                left=mid+1;
            } 
        }
        return arr;
    }
}
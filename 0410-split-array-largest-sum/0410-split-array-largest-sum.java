class Solution {
    public int splitArray(int[] nums, int k) {

        int left=0;
        int right=0;

        for (int num : nums) {
            left= Math.max(left, num);
        }
        for (int num : nums) {
            right +=num;
        }

        while(left<right){
            int mid=(right+left)/2;

            int sum=0;
            int sub=1;

            for(int i=0; i<nums.length;i++){
                sum+=nums[i];
                if(sum> mid){
                    sub++;
                    sum=nums[i];
                }
            }
            if(sub>k){
                left=mid+1;
            }
            else{
                right=mid;
            }
            
        }
        return left;
    }
}
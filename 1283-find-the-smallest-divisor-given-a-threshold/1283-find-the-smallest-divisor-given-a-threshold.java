class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int left=1;
        int right=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            right=Math.max(right, nums[i]);
            
        }

        while(left<right){
            int div=(right+left)/2;

            int sum=0;
            for(int num: nums){
                if (num % div==0 ){
                    sum+=num/div;
                }
                else{
                    sum+=(num/div)+1;
                }
                
            }
            if (sum<= threshold){
                right=div;
            }
            else{
                left=div+1;
            }
        }
        return left;
    }
}
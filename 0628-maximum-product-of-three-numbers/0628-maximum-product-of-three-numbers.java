class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int mp1= nums[0]*nums[1]*nums[n-1];
        int mp2=nums[n-1]*nums[n-2]*nums[n-3];

        if(mp1>mp2){
            return mp1;
        }
        return mp2;    
    }
}
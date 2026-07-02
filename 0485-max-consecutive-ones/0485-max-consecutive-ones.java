class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int tc=0;

        for (int i=0; i<nums.length; i++){
            
            if (nums[i]==1){
                tc++;
            }
            if (nums[i]==0){
                tc=0;
            }
            if (tc>count){
                count=tc;
            }

        }
        return count;
        
    }
}
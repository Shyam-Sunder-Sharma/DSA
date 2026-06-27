class Solution {
    public int removeDuplicates(int[] nums) {
        int [] expectednums = new int[nums.length];
        expectednums[0]=nums[0];
        int k = 1;
        for (int i=0; i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                k++;
                expectednums[k-1]=nums[i+1];
            }
            
        }
        for (int i = 0; i < k; i++){
            nums[i]=expectednums[i];
        }
        return k;
    }
}
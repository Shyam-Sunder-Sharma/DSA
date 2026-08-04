class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []count=new int[101];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }
        int smaller=0;
        for(int i=0; i<count.length; i++){
            int temp=count[i];
            count[i]=smaller;
            smaller+=temp;
        }
        int []neo=new int[nums.length];

        for(int i=0; i<nums.length; i++){
            neo[i]=count[nums[i]];
        }
        return neo;
    }
}
class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] arr1=new int[nums.length/2];
        int[] arr2=new int[nums.length/2];
        int l=0;
        int m=0;

        for (int i=0; i<nums.length; i++){
            if (nums[i]>0){
                arr1[l]=nums[i];
                l++;
            }
            else{
                arr2[m]=nums[i];
                m++;
            }
        }
        int x=0;
        int y=0;
        for (int i=0; i<nums.length; i++){
            if (i%2==0){
                nums[i]=arr1[x];
                x++;
            }
            else{
                nums[i]=arr2[y];
                y++;
            }
        }
        return nums;

        
    }
}
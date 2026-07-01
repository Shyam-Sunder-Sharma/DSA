class Solution {
    public void sortColors(int[] nums) {

        int []arr={0,0,0};
        for (int i=0; i<nums.length; i++){
            if (nums[i]==0){
                arr[0]++;
            }
            else if (nums[i]==1){
                arr[1]++;
            }
            if (nums[i]==2){
                arr[2]++;
            }
        }
        int i=0;
        while (arr[0]>0){
            nums[i]=0;
            arr[0]--;
            i++;
        }
        while (arr[1]>0){
            nums[i]=1;
            arr[1]--;
            i++;
        }
        while (arr[2]>0){
            nums[i]=2;
            arr[2]--;
            i++;
        }
    }
}
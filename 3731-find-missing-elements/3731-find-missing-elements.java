class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        int p=0;
        int a=1;
        while(p<nums.length-1){
            if(nums[p]+a != nums[p+1]){
                l.add(nums[p]+a);
                a++;
            }
            else if(nums[p]+a ==nums[p+1]){
                p++;
                a=1;
            }

        }
        return l;
    }
}
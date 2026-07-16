class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        long [] prefixGcd=new long[n];
        prefixGcd[0]=nums[0];

        long mx=nums[0];
        for(int i=1; i<n; i++){
            mx=Math.max(mx,nums[i]);
            prefixGcd[i]=gcd(nums[i], mx);
        }

        Arrays.sort(prefixGcd);
        
        long sum=0;
        int left=0;
        int right=prefixGcd.length-1;
        while(left<right){
            sum=sum+gcd(prefixGcd[left],prefixGcd[right]);
            left++;
            right--;
        }
        return sum;
        
    }

    public long gcd(long a, long b){
    while(b != 0){
        long temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
}
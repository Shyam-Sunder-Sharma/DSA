class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c=0;
        for (int i=m; i<m+n; i++){
            nums1[i]=nums2[c];
            c++;
        }
        for (int j=0;j<nums1.length;j++){
            for (int i=0; i<nums1.length-j-1; i++ ){
                if (nums1[i]>nums1[i+1]){
                    int temp=nums1[i];
                    nums1[i]=nums1[i+1];
                    nums1[i+1]=temp;
                }
        }

        }
        
        
    }
}
class Solution {
    public int maxProduct(int n) {
        int length = String.valueOf(n).length(); 
        int []arr=new int[length];

        for(int i=0; i<length; i++){
            arr[i]=n%10;
            n=n/10;
        }
        Arrays.sort(arr);
        int p=arr[length-1]*arr[length-2];
        return p;
    }
}
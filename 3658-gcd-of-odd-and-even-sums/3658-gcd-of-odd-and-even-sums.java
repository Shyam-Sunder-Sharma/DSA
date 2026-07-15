class Solution {
    public int gcdOfOddEvenSums(int n) {

        int sumOdd=0;
        int sumEven=0;
        for(int i=1; i<=2*n; i++){
            if(i%2==0){
                sumEven+=i;
            }
            else{
                sumOdd+=i;
            }
        }
        int div=0;

        for(int i=1; i<=Math.min(sumOdd,sumEven); i++){
            if(sumOdd%i==0 && sumEven%i==0){
                div=i;
            }
        }
        return div;
    }
}
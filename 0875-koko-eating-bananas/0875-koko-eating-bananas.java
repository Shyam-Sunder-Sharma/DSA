class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int min=1;
        int max = piles[0];
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        while(min<max){
            int k=(min+max)/2;
            int hours=0;

            for(int i=0; i<piles.length; i++){
                if( k<piles[i]){
                    if(piles[i]%k==0){
                        int a=(piles[i]/k);
                        hours=hours+a;
                    }
                    else{
                        int a=(piles[i]/k)+1;
                        hours=hours+a;
                    }
                }
                else{
                    hours++;
                }
            }
            if (hours>h){
                min=k+1;
            }
            else{
                max=k;
            }        
        }
       return min; 
    }
}
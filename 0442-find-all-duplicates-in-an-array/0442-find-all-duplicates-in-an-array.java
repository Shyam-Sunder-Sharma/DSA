class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int num:nums){
            hm.put(num, hm.getOrDefault(num, 0)+1);
            if(hm.get(num)>1){
                if(!l.contains(num)){
                    l.add(num);
                }
            }
        }
        return l;
    }
}
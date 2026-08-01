class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int jn:nums){
            if(set.contains(jn))return true;
             set.add(jn);
        }
        return false;
    }
}
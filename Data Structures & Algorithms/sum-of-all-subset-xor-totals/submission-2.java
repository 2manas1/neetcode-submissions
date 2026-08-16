class Solution {
    public int subsetXORSum(int[] nums) {
        int ans = 0; 
        int[]ar = new int[1];
        rec(0,nums,ar,0);
        return ar[0];
    }
    public void rec(int inx,int[]nums,int[]ar,int val){
        if(inx>=nums.length)return;
        int var = val;
        val^=nums[inx];
        ar[0]+=val;
        rec(inx+1,nums,ar,val);
        rec(inx+1,nums,ar,var);
    }
}
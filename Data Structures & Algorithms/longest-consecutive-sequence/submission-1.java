class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int mx = 1;
        int cc =1;
        if(nums.length==0)return 0;
        for(int i=1;i<nums.length;i++){
           int dif = nums[i]-nums[i-1];
           if(dif==1){
            cc++;
            mx=Math.max(mx,cc);
           }
           else if(dif>1){
            cc=1;
           }
        }
        return mx;
    }
}

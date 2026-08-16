class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int count = 0; 
        for(int in:nums){
            if(in!=0){
             prod*=in;
            }
            else{
                count++;
            }
        }
        int[]ans = new int[nums.length];
                if(count>1)return ans;
                for(int e=0;e<nums.length;e++){
                    if(count>0){
                    if(nums[e]==0){
                        ans[e]=prod;
                    }
                    }
                    else{

                        ans[e]= prod/nums[e];
                    }
                }
                return ans;
    }
}  

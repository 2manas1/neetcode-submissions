class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[]ans = new int[2];
    ans[0]=-1;
      for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
          int sm = nums[i]+nums[j];

          if(sm==target){
            ans[0]=i;
            ans[1]=j;
            break;
          }//return true;
      }
      if(ans[0]!=-1)break;
      }
return ans;
    }
    }
    //
    

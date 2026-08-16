class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        HashSet<List<Integer>>list = new HashSet<>();
        List<Integer>ls = new ArrayList<>();
         rec(list,ls,nums,0,target,0);
         List<List<Integer>>ans = new ArrayList<>(list);
         return ans;
    }
    public void rec(HashSet<List<Integer>>list,List<Integer>ls,int[]nums,int inx, int tar,int current){
        if(inx>=nums.length)return;
       // if()
     //   ls.add(nums[inx]);
        int sum = current+nums[inx];
        if(sum==tar){
            ls.add(nums[inx]);
            list.add(new ArrayList<>(ls));
            ls.remove(ls.size()-1);
        }
        if(sum<tar){
            ls.add(nums[inx]);
            rec(list,ls,nums,inx+1,tar,sum);
            rec(list,ls,nums,inx,tar,sum);
            ls.remove(ls.size()-1);
        }
        rec(list,ls,nums,inx+1,tar,current);

    }
}

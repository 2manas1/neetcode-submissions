/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static int min= 0;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode>st = new Stack<>();
        preorder(root,p.val,q.val,st,0);
       // preorder(root,st);
       return st.pop();
    }
    public void preorder(TreeNode root, int el, int el1, Stack<TreeNode>st,int ht){
        if(root==null)return;
        int[]ar = new int[2];
        prmorder(root,el,el1,ar);
        if(ar[0]>0 && ar[1]>0){
            if(st.isEmpty()){
                st.push(root);
                min=ht;
            }
            else if(ht>min){
                min=ht;
                st.clear();
                st.push(root);
            }
        }
        preorder(root.left,el,el1,st,ht+1);
        preorder(root.right,el,el1,st,ht+2);
    }
    public void prmorder(TreeNode root, int a, int b, int[]ar){
        if(root==null){
            return;
        }
        if(root.val==a){
            ar[0]++;
        }
        if(root.val==b){
            ar[1]++;
        }
        prmorder(root.left,a,b,ar);
        prmorder(root.right,a,b,ar);
    }
}
class Solution {
    public class Node{
        int el;
        int fk;
        Node(int el){
            this.el=el;
            this.fk=1;
        }
        void inc(){
            this.fk = this.fk+1;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
         int[]ans = new int[k];
         PriorityQueue<Node>queue = new PriorityQueue<>((a,b)->b.fk-a.fk);
         HashMap<Integer,Node>map = new HashMap<>();
         for(int j=0;j<nums.length;j++){
            int elm =nums[j];
            if(!map.containsKey(elm)){
                Node nd = new Node(elm);
                map.put(elm,nd);
            }
            else{
                map.get(elm).inc();
            }
         }
         for(Node hj:map.values()){
            queue.offer(hj);
         }
         int in =0;
         while(!queue.isEmpty()){
            Node gett = queue.poll();
            ans[in]=gett.el;
            in++;
            if(in==k)break;
         }
         return ans;
    }
}

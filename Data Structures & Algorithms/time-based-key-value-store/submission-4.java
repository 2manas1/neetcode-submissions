class TimeMap {
    public class Node{
        String value;
        int val;
        Node(String vall, int valuee){
            this.value = vall;
            this.val=valuee;
        }
    }
    HashMap<String,List<Node>>map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
         Node ns = new Node(value,timestamp);
        if(!map.containsKey(key)){
            List<Node>ls = new ArrayList<>();
            ls.add(ns);
            map.put(key,ls);
        }
        else{
            map.get(key).add(ns);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
       List<Node>list = map.get(key);
        PriorityQueue<Node>queue = new PriorityQueue<>((a,b)->a.val-b.val);
        for(Node nnn:list){
            queue.offer(nnn);
        }
String ans = "";
        while(!queue.isEmpty()){
            Node np =queue.poll();
            if(np.val==timestamp){
                ans=np.value;
                break;
            }
            else if(np.val<timestamp){
                ans=np.value;
            }
            else{
                break;
            }
        }
       
        return ans;
    }
}

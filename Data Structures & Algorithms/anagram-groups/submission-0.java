class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>>map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String st = strs[i];
            List<Character>ls = new ArrayList<>();
            for(int j=0;j<st.length();j++){
                char ch = st.charAt(j);
                ls.add(ch);
            }
            Collections.sort(ls);
            StringBuilder sb = new StringBuilder();
            for(char jn:ls){
                sb.append(jn);
            }
            String ss = sb.toString();
            if(!map.containsKey(ss)){
                List<String>list = new ArrayList<>();
                list.add(st);
                map.put(ss,list);
            }
            else{
                map.get(ss).add(st);
            }
        }
        for(List<String>ik:map.values()){
            ans.add(new ArrayList<>(ik));
        }
        return ans;



    }
}

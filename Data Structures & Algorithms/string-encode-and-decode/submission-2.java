class Solution {

    public String encode(List<String> strs) {
        if(strs.equals(""))return "";
         StringBuilder sb  = new StringBuilder();
         String add = "This is My Decoding breaker";
 String bdd = "EmptyString";
         for(String st:strs){
            if(st.equals("")){
                sb.append(bdd);
            }
            else{
            sb.append(st);
            }
            sb.append(add);
         }
         return sb.toString();
    }

    public List<String> decode(String str) {

        List<String>list = new ArrayList<>();
                if(str.equals(""))return list;
         String bdd = "EmptyString";
       String[]ar  = str.split("This is My Decoding breaker");
       for(String ss:ar){
        if(ss.equals(bdd)){
            list.add("");
        }
        else{
        list.add(ss);
        }
       }
       return list;
    }
}

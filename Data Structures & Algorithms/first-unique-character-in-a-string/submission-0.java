class Solution {
    public int firstUniqChar(String s) {
        int[]ar = new int[26];
        for(int i=0;i<s.length();i++){
            ar[s.charAt(i)-'a']++;
        }
        for(int a=0;a<s.length();a++){
            if(ar[s.charAt(a)-'a']==1){
                return a;
            }
        }
        return -1;
    }
}
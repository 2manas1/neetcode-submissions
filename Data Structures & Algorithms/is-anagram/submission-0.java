class Solution {
    public boolean isAnagram(String s, String t) {
      int[]ar = new int[26];
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        ar[ch-'a']++;
      }
      for(int c=0;c<t.length();c++){
        char chh= t.charAt(c);
        if(ar[chh-'a']==0)return false;
        ar[chh-'a']--;
      }
      for(int x=0;x<ar.length;x++){
        if(ar[x]!=0)return false;
      }
      return true;

    }
}

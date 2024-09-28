class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int [] Hash = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            ++Hash[s.charAt(i)-'a'];
            --Hash[t.charAt(i)-'a'];
        }
        for(int i=0;i<26;i++){
            if(Hash[i]!=0) return false;
        }
        return true;
    }
}
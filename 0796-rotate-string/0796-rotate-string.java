class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
            String t = s.substring(s.length()-i)+s.substring(0,s.length()-i);
            if(t.equals(goal)) return true;
        }
        return false;
    }
}
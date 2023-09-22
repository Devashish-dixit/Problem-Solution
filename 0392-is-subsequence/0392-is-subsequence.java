class Solution {
    public boolean isSubsequence(String s, String t) {
        char temp;
        int i = 0;
        int count = 0;
        while(i < t.length() && count<s.length()){
            if(s.charAt(count)==t.charAt(i)) count++;
            i++;
        }
        return count == s.length();
    }
}
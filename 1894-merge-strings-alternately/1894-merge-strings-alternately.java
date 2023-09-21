class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int i=0;
        int len = word1.length() + word2.length();
        while(i<len){
            if(i<word1.length()) s.append(word1.charAt(i));
            if(i<word2.length()) s.append(word2.charAt(i));
            i++;
        }
        return s.toString();
    }
}
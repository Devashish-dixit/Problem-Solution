class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> h = new HashMap<>();;
        for(int i=0;i<magazine.length();i++){
            char r = magazine.charAt(i);
            int cm = h.getOrDefault(r,0);
            h.put(r,cm + 1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char k = ransomNote.charAt(i);
            int cr = h.getOrDefault(k,0);
            if(cr ==0) return false;
            h.put(k,cr - 1);
        }
        return true;
    }
}
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> a = new Stack();
        Stack<Character> b = new Stack();
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        for(int i=0;i<s.length();i++){
            if(sa[i] == '#' && !a.isEmpty()){
                a.pop();
            }
            else if( sa[i]!= '#'){
                a.push(sa[i]);
            }
        }
        for(int i=0;i<t.length();i++){
            if(ta[i] == '#' && !b.isEmpty()){
                b.pop();
            }
            else if( ta[i]!= '#'){
                b.push(ta[i]);
            }
        }
        return a.equals(b);
    }
}
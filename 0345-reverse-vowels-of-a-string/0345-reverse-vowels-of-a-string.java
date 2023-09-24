class Solution {
    public String reverseVowels(String s) {
        char[] ar = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        char temp;

        while(start<end){
            while(start<end && !isVowel(ar[start])) start++;
            while(start<end && !isVowel(ar[end])) end--;

            if(start<end){
                temp = ar[start];
                ar[start] = ar[end];
                ar[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ar);
    }

    private boolean isVowel(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c== 'E' || c== 'I' || c=='O' || c=='U');
    }
}
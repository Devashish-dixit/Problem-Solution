class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String pal = "";
        int pallen = 0;
        for(int i=0;i<n;i++)
        {
                int l=i,r=i;
                while(l>=0 && r<n && s.charAt(l)==s.charAt(r))
                {
                    if(r-l+1>pallen){
                        pal = s.substring(l,r+1);
                        pallen = r-l+1;
                    }
                    l-=1;
                    r+=1;
                }

                l=i; r=i+1;
                while(l>=0 && r<n && s.charAt(l)==s.charAt(r))
                {
                    if(r-l+1>pallen){
                        pal = s.substring(l,r+1);
                        pallen = r-l+1;
                    }
                    l-=1;
                    r+=1;
                }
        }
        return pal;
    }
}
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        pal = ""
        pallen = 0
        n = len(s)

        for i in range(n):
            l,r = i,i
            while(l>=0 and r<n and s[l]==s[r]):
                if pallen < r-l+1:
                    pal = s[l:r+1]
                    pallen = r-l+1
                l-=1
                r+=1
            l-=1
            r+=1
            l,r = i,i+1
            while(l>=0 and r<n and s[l]==s[r]):
                if pallen < r-l+1:
                    pal = s[l:r+1]
                    pallen = r-l+1
                l-=1
                r+=1
            l-=1
            r+=1
        return pal
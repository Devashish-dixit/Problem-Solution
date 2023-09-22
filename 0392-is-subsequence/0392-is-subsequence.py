class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        i,count = 0,0
        while(i<len(t) and count<len(s)):
            if t[i]==s[count]:
                count +=1
            i +=1
        return count == len(s)
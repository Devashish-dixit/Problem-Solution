class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        word = list(s)
        start = 0
        end = len(s)-1
        while start<end:
            while start<end and not self.isVowel(word[start]):
                start +=1
            while start<end and not self.isVowel(word[end]):
                end -=1
            if start<end:
                word[start], word[end] = word[end], word[start]
                start += 1
                end -= 1
        return "".join(word)
    def isVowel(self,c):
        return (c=='a' or c=='e' or c=='i' or c=='o' or c=='u' or c=='A' or c== 'E' or c== 'I' or c=='O' or c=='U')
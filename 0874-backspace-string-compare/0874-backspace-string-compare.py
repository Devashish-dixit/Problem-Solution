class Solution(object):
    def backspaceCompare(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        stacka = []
        stackb = []

        for c in s:
            if stacka and c=='#':
                stacka.pop()
            elif c!='#':
                stacka.append(c)
        for c in t:
            if stackb and c=='#':
                stackb.pop()
            elif c!='#':
                stackb.append(c)
        return stacka==stackb
        
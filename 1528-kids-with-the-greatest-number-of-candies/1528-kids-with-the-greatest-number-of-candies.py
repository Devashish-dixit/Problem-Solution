class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        n = max(candies)
        res = [False]*len(candies)
        for i in range(len(candies)):
            if candies[i] + extraCandies >= n :
                res[i] = True
            else:
                res[i] = False
        return res
class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = [0]*len(nums)
        count = 0
        for i in nums:
            res[count] = i**2
            count +=1
        res.sort()
        return res
        
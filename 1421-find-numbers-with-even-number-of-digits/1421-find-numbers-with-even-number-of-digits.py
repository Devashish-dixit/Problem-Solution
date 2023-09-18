class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        for i in nums:
            if((i>9 and i<100)or(i>999 and i<10000)or(i>99999 and i<1000000)):
                 count += 1
        return count
        
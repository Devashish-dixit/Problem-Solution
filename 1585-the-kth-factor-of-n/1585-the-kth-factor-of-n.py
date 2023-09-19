class Solution(object):
    def kthFactor(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: int
        """
        arr = []
        for i in range(1,n+1):
            if n%i == 0:
                arr.append(i)
        if(len(arr)<k):
            return -1
        return arr[k-1]
        
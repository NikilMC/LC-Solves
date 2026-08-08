class Solution(object):
    def findMatrix(self, nums):
        l=[]
        l1=[]
        while(len(nums)!=0):
            for i in nums:
                if i not in l1:
                    l1.append(i)
            for i in l1:
                nums.remove(i)
            l.append(l1)
            l1=[]
        return l
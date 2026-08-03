class Solution(object):
    def divideArray(self, nums, k):
        nums.sort()
        l=[]
        l1=0
        for i in range(2,len(nums),3):
            if(nums[i]-nums[l1]<=k):
                l.append(nums[l1:i+1])
            l1=i+1
        if(len(l)!=len(nums)/3):
            return []
        return l
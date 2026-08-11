class Solution(object):
    def getAverages(self, nums, k):
        ans=[-1]*len(nums)
        temp=[]
        left=0
        right=2*k
        currsum=sum(nums[left:right+1])
        while(right<len(nums)):
            temp.append(currsum/(2*k+1))
            right+=1
            if(right<len(nums)):
                currsum+=nums[right]
            currsum-=nums[left]
            left+=1
        ans[k:len(nums)-k]=temp
        return ans
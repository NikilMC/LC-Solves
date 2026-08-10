class Solution(object):
    def countSubarrays(self, nums, k):
        def maxcount(nums,k):
            l=0
            ans=0
            curr=0
            maxel=max(nums)
            for r in range(len(nums)):
                if(nums[r]==maxel):
                    curr+=1
                while(curr>k):
                    if(nums[l]==maxel):
                        curr-=1
                    l+=1
                ans+=r-l+1
            return ans
        return ((len(nums))*(len(nums)+1))//2-maxcount(nums,k-1)
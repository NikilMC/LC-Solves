class Solution {
    public int minLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int currsum=0;
        int ans=Integer.MAX_VALUE;
        int l=0;
        for(int r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if(map.get(nums[r])==1){
                currsum+=nums[r];
            }
            while(currsum>=k){
                ans=Math.min(r-l+1,ans);
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                    currsum-=nums[l];
                }
                l++;
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}
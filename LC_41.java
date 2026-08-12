class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            set.add(nums[i]);
        }
        for(int i=1;i<=max;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        if(max<=0){
            return 1;
        }
        return max+1;
    }
}
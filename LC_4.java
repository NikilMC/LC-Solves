class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left=0;
        int right=0;
        ArrayList<Integer> x = new ArrayList<>();
        while(left!=nums1.length || right!=nums2.length){
            if(left==nums1.length){
                x.add(nums2[right++]);
            }
            else if(right==nums2.length){
                x.add(nums1[left++]);
            }
            else if(nums1[left]<nums2[right]){
                x.add(nums1[left++]);
            }
            else if(nums1[left]>nums2[right]){
                x.add(nums2[right++]);
            }
            else if(nums1[left]==nums2[right]){
                x.add(nums1[left++]);
                x.add(nums2[right++]);
            }
        }
        double ans=0.0;
        if(x.size()%2==0){
            ans+=x.get(x.size()/2)+x.get(x.size()/2-1);
            ans/=2;
        }
        else{
            ans+=x.get(x.size()/2);
        }
        return ans;
    }
}
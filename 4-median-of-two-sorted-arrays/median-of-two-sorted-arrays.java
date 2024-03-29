class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] ans = new int[n];
        int ind = 0;
        for(int i=0;i<nums1.length;i++){
            ans[ind++] = nums1[i];
            
        }
        for(int i=nums2.length-1;i>=0;i--){
            ans[ind++] = nums2[i];
        }
        Arrays.sort(ans);
        //System.out.println(ans);
        if(ans.length%2!=0){
            return (double)ans[(ans.length)/2];
        }else{
            double res = ans[ans.length/2] + ans[(ans.length/2)-1];
            return res/2;
        }
    }
}
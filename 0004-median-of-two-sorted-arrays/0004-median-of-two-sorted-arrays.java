class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>arr = new ArrayList<>();
        for(int i = 0 ; i < nums1.length ; i++)
        {
            arr.add(nums1[i]);
        }
        for(int j = 0 ; j < nums2.length ; j++)
        {
            arr.add(nums2[j]);
        }
        arr.sort(null);
        double ans = 0;
        int n = arr.size();
        
        
        if (n % 2 == 0) {
    ans = (arr.get(n/2 - 1) + arr.get(n/2)) / 2.0;
} else {
    ans = arr.get(n/2);
}
        return ans;
    }
}
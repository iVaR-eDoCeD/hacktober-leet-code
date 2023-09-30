/* 
Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 
Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        float ans=0 ;
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            list1.add(nums2[j]);
        }
        Collections.sort(list1);
        int len;
        if(list1.size()%2==0){
           len= list1.size()/2;
           ans= list1.get(len-1)+list1.get(len);
           ans= (float)ans/2;
        }else{
            len = (list1.size())/2;
            ans = list1.get(len);
        }
        return ans;
    }
}
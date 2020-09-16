class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // MERGE SORT
        int p1 = 0;
        int p2 = 0;
        int m = nums1.length;
        int n = nums2.length;
        int answer[] = new int[m+n];
        int k = 0;
        
        while(p1 < m && p2 <n) {
            if(nums1[p1] > nums2[p2]) {
                answer[k++] = nums2[p2];
                p2++;
            } else {
                answer[k++] = nums1[p1];
                p1++;
            }
        }
        while(p1<m)  {
            answer[k++] = nums1[p1];
            p1++;
        }
        while(p2<n) {
            answer[k++] = nums2[p2];
            p2++;
        }
        
        int midcheck = (m+n);
        if(midcheck % 2 == 0) {// si el numero de elementos de nuestro array answer es par
            return (double) (answer[midcheck/2] + answer[(midcheck/2)-1]) / 2.0;
        } else { // si es impar
            return answer[(midcheck/2)];
        }
    }
}

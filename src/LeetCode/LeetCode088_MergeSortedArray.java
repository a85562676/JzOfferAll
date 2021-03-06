package LeetCode;

public class LeetCode088_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] <= nums2[n - 1]) {
                nums1[len - 1] = nums2[n - 1];
                n--;
            } else {
                nums1[len - 1] = nums1[m - 1];
                m--;
            }
            len--;
        }
        if (m > 0) {
            for (int i = m - 1; i >= 0; i--) {
                nums1[len - 1] = nums1[i];
                len--;
            }
        }

        if (n > 0) {
            for (int j = n - 1; j >= 0; j--) {
                nums1[len - 1] = nums2[j];
                len--;
            }
        }
    }

}

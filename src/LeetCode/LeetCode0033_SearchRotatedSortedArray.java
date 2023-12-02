package LeetCode;

/**
Example 1:
 Input: nums = [4,5,6,7,0,1,2], target = 0
 Output: 4

Example 2:
 Input: nums = [4,5,6,7,0,1,2], target = 3
 Output: -1

Example 3:
 Input: nums = [1], target = 0
 Output: -1
 */
public class LeetCode0033_SearchRotatedSortedArray {

    public static int search(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == num) {
                return mid;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                while (low != mid && arr[low] == arr[mid]) {
                    low++;
                }
                if (low == mid) {
                    low = mid + 1;
                    continue;
                }
            }
            if (arr[low] != arr[mid]) {
                if (arr[mid] > arr[low]) {
                    if (num >= arr[low] && num < arr[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    if (num > arr[mid] && num <= arr[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            } else {
                if (arr[mid] < arr[high]) {
                    if (num > arr[mid] && num <= arr[high])  {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                } else {
                    if (num >= arr[low] && num < arr[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}

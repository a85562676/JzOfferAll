package LeetCode;

public class LeetCode0042_TrappingRainWater {

    public static int trap(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }
        int N = arr.length;
        int L = 1;
        int leftMax = arr[0];
        int R = N - 2;
        int rightMax = arr[N - 1];
        int water = 0;
        while (L <= R) {
            if (leftMax <= rightMax) {
                water += Math.max(0, leftMax - arr[L]);
                leftMax = Math.max(leftMax, arr[L++]);
            } else {
                water += Math.max(0, rightMax - arr[R]);
                rightMax = Math.max(rightMax, arr[R--]);
            }
        }
        return water;
    }
}

package Zuochengyunbook.Chapter8;

public class Code5_GetMinLength {

    public static int getMinLength(int[] arr) {
        if (arr.length < 2 || arr == null) {
            return 0;
        }

        int min = arr[arr.length - 1];
        int noMinIndex = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > min) {
                noMinIndex = i;
            } else {
                min = Math.min(min, arr[i]);
            }
        }
        if (noMinIndex == -1) {
            return 0;
        }

        int max = arr[0];
        int noMaxIndex = -1;
        for (int j = 1; j <= arr.length - 1; j++) {
            if (arr[j] < max) {
                noMaxIndex = j;
            } else {
                max = Math.max(max, arr[j]);
            }
        }

        return noMaxIndex - noMinIndex + 1;
    }

    public static void main(String[] args) {
        int length = getMinLength(new int[]{1, 5, 3, 4, 2, 6, 7});
        System.out.println(length);
    }

}

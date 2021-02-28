package code;
// 逆序对问题   归并排序
public class Code91_FindInversePairs {

    public static int smallSum(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static int mergeSort(int[] arr, int l, int r) {
        if (l == r)
            return 0;
        int mid = l + ((r - l) >> 1);
        return  mergeSort(arr, l, mid) + // 左侧产生的逆序对数目
                mergeSort(arr, mid + 1, r) + // 右侧产生的逆序对数目
                merge(arr, l, mid, r); // merge过程中产生的逆序对数目
    }

    public static int merge(int[] arr, int l, int m, int r) {
        int[] help = new int[r - l + 1];
        int i = help.length - 1;
        int p1 = m;
        int p2 = r;
        int res = 0;
        while (p1 >= l && p2 >= m+1) {
            res += arr[p1] > arr[p2] ? (p2 - m) : 0;
            help[i--] = arr[p1] > arr[p2] ? arr[p1--] : arr[p2--];
        }
        while (p1 >= l)
            help[i--] = arr[p1--];
        while (p2 >= m+1)
            help[i--] = arr[p2--];
        for (i = 0; i < help.length; i++)
            arr[i + l] = help[i];
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 5, 6};
        System.out.println(smallSum(arr));
    }
}

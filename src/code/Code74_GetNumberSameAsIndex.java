package code;

public class Code74_GetNumberSameAsIndex {

    public static int GetNumberSameAsIndex(int[] numbers, int length){
        if(numbers == null || length <= 0){
            return -1;
        }
        int left = 0;
        int right = length - 1;
        while(left <= right){
            int middle = left + ((right - left) >> 1);
            if(numbers[middle]==middle){
                return middle;
            }
            if(numbers[middle] > middle)
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{-3,-1,1,3,5};
        System.out.println(GetNumberSameAsIndex(nums,5));
    }
}

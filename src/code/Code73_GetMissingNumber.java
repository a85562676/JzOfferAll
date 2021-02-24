package code;

public class Code73_GetMissingNumber {

    public static int GetMissingNumber(int[] numbers, int length){
        if(numbers == null || length <= 0){
            return -1;
        }
        int left = 0;
        int right = length - 1;
        while(left <= right ){
            int middle = (right + left) >> 1;
            if(numbers[middle] != middle) {
                if(middle == 0 || numbers[middle - 1] == middle - 1)
                    return middle;
                right = middle -1;
            }
            else
                left = middle + 1;
        }
        if(left == length)
            return length;

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(GetMissingNumber(new int[]{0,1,2,3,5},5));
    }

}

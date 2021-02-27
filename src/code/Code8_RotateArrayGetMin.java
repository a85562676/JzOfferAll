package code;

public class Code8_RotateArrayGetMin {

    public static int getMin(int[] numbers, int length){
        if(numbers == null || length <= 0){
            throw new IllegalArgumentException("Invalied parameters!");
        }

        int index1 = 0;
        int index2 = length - 1;
        int indexMid = index1;
        while(numbers[index1] >= numbers[index2]){
            if(index2 - index1 == 1){
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2) / 2;

            //如果下标为index1、index2、indexMid 指向的三个数字相等，则只能顺序查找
            if(numbers[index1] == numbers[index2] && numbers[indexMid] == numbers[index1]){
                return getMinOrder(numbers, index1, index2);
            }

            if(numbers[indexMid] >= numbers[index1]){
                index1 = indexMid;
            }
            else if(numbers[indexMid] <= numbers[index2]){
                index2 = indexMid;
            }
        }
        return numbers[indexMid];
    }

    public static int getMinOrder(int[] numbers, int index1, int index2) {
        int result = numbers[index1];
        for (int i = index1 + 1; i <= index2 ; i++) {
            if(result > numbers[i]){
                result = numbers[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int min = getMin(new int[]{4, 5, 6, 2, 3}, 5);
        System.out.println(min);
    }
}

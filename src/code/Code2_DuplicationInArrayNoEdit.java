package code;

public class Code2_DuplicationInArrayNoEdit {

    public static int getDuplication(int[] numbers) {
        if (numbers == null || numbers.length < 1) {
            return -1;
        }

        int start = 1;
        int end = numbers.length - 1;
        while (end >= start) {
            int middle = start + ((end - start) >> 1);

            // 调用 log n 次
            int count = countRange(numbers, start, middle);
            if (start == end) {
                if (count > 1) {
                    return start;
                }
                break;
            } else {
                // 无法找出所有重复的数
                if (count > (middle - start) + 1) {
                    end = middle;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }

    private static int countRange(int[] numbers, int start, int end) {
        if (numbers == null) {
            return 0;
        }
        int count = 0;
        for(int e : numbers) {
            if (e >= start && e <= end) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = new int[]{2,3,5,4,3,2,6,7};
        System.out.println(getDuplication(arr));
    }
}

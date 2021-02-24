package code;

public class Code69_MaxDiff {

    public static int MaxDiff(int[] numbers){
        if(numbers == null && numbers.length < 2){
            return 0;
        }

        int min = numbers[0];
        int maxDiff = numbers[1] - min;

        for(int i = 2; i < numbers.length; ++i) {
            if(numbers[i - 1] < min)
                min = numbers[i - 1];

            int currentDiff = numbers[i] - min;
            if(currentDiff > maxDiff)
                maxDiff =currentDiff;
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 11, 8, 5, 7, 12, 16, 14};
        System.out.println(MaxDiff(numbers));
    }
}

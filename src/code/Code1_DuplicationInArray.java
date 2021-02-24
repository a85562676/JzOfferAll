package code;

public class Code1_DuplicationInArray {
       // 找出数组中重复的数字
       public static boolean duplicate(int[] numbers, int length, int[] duplication) {
           if (numbers == null || length < 1) {
               return false;
           }
           for (int e : numbers) {
               if (e >= length) {
                   return false;
               }
           }

           for (int i = 0; i < length; ++i) {
               while(numbers[i] != i) {
                   if (numbers[i] == numbers[numbers[i]]) {
                       duplication[0] = numbers[i];
                       return true;
                   }
                   swap(numbers, i, numbers[i]);
               }
           }
           return false;
       }

        private static void swap(int[] numbers, int i, int j) {
            int t = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = t;
        }

        public static void main(String[] args){
            int[] arr = new int[]{2,3,1,0,2,5,3};
            System.out.println(duplicate(arr,7,new int[]{1}));
        }
}

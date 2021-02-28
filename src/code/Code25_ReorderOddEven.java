package code;
import java.util.ArrayList;
import java.util.Arrays;

//
public class Code25_ReorderOddEven {
    public static void ReorderOddEven(int[] data){
        if(data == null || data.length == 0){
            return;
        }
        int p1 = 0;
        int p2 = data.length - 1;

        while(p1 < p2){
            //向后移动p1，直到它指向偶数
            while(p1 < p2 && (data[p1] & 0x1) !=0)
                p1++;

            //向前移动p2，直到它指向奇数
            while(p1 < p2 && (data[p2] & 0x1) ==0)
                p2--;

            if(p1 < p2){
                int temp = data[p1];
                data[p1] = data[p2];
                data[p2] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,4,5};
        ReorderOddEven(data);
        System.out.println(Arrays.toString(data));
    }
}

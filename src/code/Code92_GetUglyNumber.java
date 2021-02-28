package code;

public class Code92_GetUglyNumber {

    public static int GetUglyNumber_Solution(int index) {
        if(index < 7) {
            return index;
        }
        int [] ugly = new int [index];
        ugly[0] = 1;
        int min = 1;
        int _m2 = 0;
        int _m3 = 0;
        int _m5 = 0;
        for(int i = 1; i < index; i++) {
            ugly[i] = Math.min(ugly[_m2] * 2,Math.min(ugly[_m3] * 3, ugly[_m5] * 5));
            if(ugly[i] == ugly[_m2] * 2)
                _m2++;
            if(ugly[i] == ugly[_m3] * 3)
                _m3++;
            if(ugly[i] == ugly[_m5] * 5)
                _m5++;
        }

        return ugly[index-1];
    }

    public static void main(String[] args) {
        int res = GetUglyNumber_Solution(7);
        System.out.println(res);
    }
}

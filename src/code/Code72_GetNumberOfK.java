package code;

public class Code72_GetNumberOfK {

     //求有序数组[1, 2, 3, 3, 3, 3, 4, 5]中3出现的次数

    public static int GetFirstK(int[] data, int length, int k, int start, int end){
        if(start > end){
            return -1;
        }
        int midIndex = (start + end) / 2;
        int midData = data[midIndex];
        if(midData == k) {
            if ((midIndex > 0 && data[midIndex - 1] != k) || midIndex == 0) {
                return midIndex;
            } else {
                end = midIndex - 1;
            }
        }
        else if(midData < k){
            start = midIndex + 1;
        }
        else
            end = midIndex - 1;

        return GetFirstK(data,length,k,start,end);
    }

    public static int GetLastK(int[] data, int length, int k, int start, int end){
        if(start > end)
            return -1;
        int midIndex = (start + end) / 2;
        int midData = data[midIndex];

        if(midData == k){
            if((midIndex < length - 1 && data[midIndex + 1] != k) || midIndex == length -1){
                return midIndex;
            }else{
                start = midIndex + 1;
            }
        }
        else if(midData > k){
            end = midIndex - 1;
        }
        else{
            start = midIndex + 1;
        }
        return GetLastK(data, length, k, start, end);
    }

    public static int GetNumberOfK(int[] data, int length, int k){
        int number = 0;
        if(data != null && length > 0){
            int first = GetFirstK(data,length,k,0,length-1);
            int last = GetLastK(data,length,k,0,length-1);
            if(first > -1 && last > -1)
                number = last - first + 1;
        }
        return number;
    }

    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,3,3,3,4,5};
        System.out.println(GetNumberOfK(data,8,3));
    }
}

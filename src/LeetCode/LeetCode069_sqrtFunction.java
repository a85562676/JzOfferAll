package LeetCode;

public class LeetCode069_sqrtFunction {
    public static boolean guess(long x,long y){
        return (long)x*x<=y;
    }

    public static int mySqrt(int y) {
        long L=0,R=(long)y+1; //[0,y)
        long ans=0;
        while(L<R){
            long mid=(L+R)/2;
            if(guess(mid,y)){
                ans=mid;
                L=mid+1;
            }else{
                R=mid;
            }
        }
        return (int)ans;
    }
}

package Zuochengyunbook.Chapter4;

/**
 * 换钱的最少货币数，货币可重复使用
 * arr=[5, 2, 3], aim=20, 返回4
 * arr=[5, 2, 3], aim=0, 返回0
 * arr=[3, 5], aim=2, 返回-1
 */
public class Code003_MinCoins {

    public static int minCoinsl(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return -1;
        }
        return process(arr, 0, aim);
    }

    //arr=[5,2,3] aim=20, 4张五元
    //当前考虑的面值为arr[i] 还剩rest的钱需要找零
    public static int process(int[] arr, int i, int rest) {
        //i=arr.length的时候，数组中的面值都已经用过
        //如果当时剩余的钱rest是0，就返回0张
        //如果当时剩余的钱不是0，就返回-1
        if (i == arr.length) {
            return rest == 0 ? 0 : -1;
        }
        //初始化需要的货币数 num=-1
        int num = -1;
        //对于当前的面值，依次从0张，1张，2张..往下遍历，终止条件就是 张数*面值<=剩余钱数
        for (int k = 0; k * arr[i] <= rest; k++) {
            //使用了k张当前面值，剩余钱rest=rest-k*当前面值
            //然后剩余的钱交给后面的面值来处理
            int next = process(arr, i + 1, rest - k * arr[i]);
            //如果剩下的钱经过后面的面值没有处理完，就返回 -1
            //next != -1 说明剩下的钱可以由后面的面值来处理
            if (next != -1) {
                //如果当前货币数为-1，就将货币数设置为 next+k，否则就设置为 当前货币数和next+k中更小的那个
                num = num == -1 ? next + k : Math.min(num, next + k);
            }
        }
        return num;
    }


    public static void main(String[] args) {
        int[] arr = {5, 2, 3};
        System.out.println(minCoinsl(arr, 20));
    }
}

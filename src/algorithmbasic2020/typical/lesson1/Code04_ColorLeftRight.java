package algorithmbasic2020.typical.lesson1;

/**
 题目四
 有一些排成一行的正方形。每个正方形已经被染成红色或者绿色。现在可以
 选择任意一个正方形然后用这两种颜色的任意一种进行染色，这个正方形的颜
 色将会被覆盖。目标是在完成染色之后，每个红色R都比每个绿色G距离最左侧
 近。返回最少需要涂染几个正方形。
 如样例所示:s = RGRGR我们涂染之后变成RRRGG满足要求了,涂染的个数为2,
 没有比这个更好的涂染方案。
 */


public class Code04_ColorLeftRight {

    // RGRGR -> RRRGG
    public static int minPaint(String s) {
        if (s == null || s.length() < 2) {
            return 0;
        }
        char[] chs = s.toCharArray();
        int[] right = new int[chs.length];
        right[chs.length - 1] = chs[chs.length - 1] == 'R'? 1 : 0;
        for (int i = chs.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] + (chs[i] == 'R' ? 1 : 0);
        }
        int res = right[0];
        int left = 0;
        for (int i = 0; i < chs.length - 1; i++) {
            left += chs[i] == 'G' ? 1 : 0;
            res = Math.min(res, left + right[i + 1]);
        }
        res = Math.min(res, left + (chs[chs.length - 1] == 'G' ? 1 : 0));
        return res;
    }

    public static void main(String[] args) {

        System.out.println(minPaint("RGRGR"));
    }
}

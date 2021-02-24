package code;

public class Code13_RectCover {

    public int RectCover(int target) {
        if (target < 3) {
            return target;
        }
        int res1 = 1;
        int res2 = 2;
        int res = 0;
        for (int i = 3; i <= target; ++i) {
            res = res1 + res2;
            res1 = res2;
            res2 = res;
        }
        return res;
    }
}

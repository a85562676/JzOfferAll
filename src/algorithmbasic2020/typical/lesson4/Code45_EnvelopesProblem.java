package algorithmbasic2020.typical.lesson4;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Comparator;

/**
题目五：
每个信封都有长和宽两个纬度的数据，A信封如果想套在B信封里面，A信封必须在长和宽上都小于
B信封才行。如果给你一批信封，返回最大的嵌套层数
 */

public class Code45_EnvelopesProblem {

    public static class Envelope {
        public int l;
        public int h;

        public Envelope(int weight, int height) {
            l = weight;
            h = height;
        }
    }

    public static class EnvelopeComparator implements Comparator<Envelope> {
        @Override
        public int compare(Envelope o1, Envelope o2) {
            return o1.l != o2.l ? o1.l - o2.l : o2.h - o1.h;
        }
    }

    public static Envelope[] getSortEnvelopes(int[][] matrix) {
        Envelope[] res = new Envelope[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            res[i] = new Envelope(matrix[i][0], matrix[i][1]);
        }
        Arrays.sort(res, new EnvelopeComparator());
        return res;
    }

    public static int maxEnvelopes(int[][] matrix) {
        Envelope[] envelopes = getSortEnvelopes(matrix);
        int[] ends = new int[matrix.length];
        ends[0] = envelopes[0].h;
        int right = 0;
        int l = 0;
        int r = 0;
        int m = 0;

        for (int i = 1; i < envelopes.length; i++) {
            l = 0;
            r = right;
            while (l <= r) {
                m = (l + r) / 2;
                if (envelopes[i].h > ends[m]) {
                    l = m + 1;
                } else {
                    r = m -1;
                }
            }
            right = Math.max(right, l);
            ends[l] = envelopes[i].h;
        }
        return right + 1;
    }
}

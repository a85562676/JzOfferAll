package code;

public class Code39_SequenceOfBst {

    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length < 1) {
            return false;
        }
        return verify(sequence,0,sequence.length - 1);
    }

    public static boolean verify(int[] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }
        int val = sequence[end];
        int i = start;
        for (; i <= end; ++i) {
            if (sequence[i] >= val) {
                break;
            }
        }

        for (int j = i; j < end; ++j) {
            if (sequence[j] < val) {
                return false;
            }
        }
        return verify(sequence, start, i - 1) && verify(sequence, i + 1, end - 1);
    }



    public static void main(String[] args) {
        System.out.println(VerifySquenceOfBST(new int[]{5,7,6,9,11,10,8}));
    }
}

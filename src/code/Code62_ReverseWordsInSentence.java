package code;

public class Code62_ReverseWordsInSentence {

    public static String reverseWords(String s) {
        if (s == null || s.length() == 0 || s.trim().equals("")) {
            return s;
        }

        String[] arr = s.split(" ");
        int p = 0, q = arr.length - 1;
        while (p < q) {
            swap(arr, p++, q--);
        }
        return String.join(" ", arr);
    }
    public static void swap(String[] arr, int p, int q) {
        String t = arr[p];
        arr[p] = arr[q];
        arr[q] = t;
    }



}

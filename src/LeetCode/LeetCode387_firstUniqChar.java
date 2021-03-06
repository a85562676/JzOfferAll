package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode387_firstUniqChar {

    public static int firstUniqChar(String s) {
        for(int i = 0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
                return i;
        }
        return -1;
    }

    public static int firstUniqChar1(String s) {
        int[] arr = new int[256];
        for(char c: s.toCharArray()) {
            arr[c]++;
        }
        for(int i=0; i<s.length(); i++) {
            if(arr[s.charAt(i)] == 1) return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        String str = "aabbaa";
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.toArray();
        Arrays.toString(list.toArray());
    }

}

package LeetCode;

public class LeetCode242_isAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int[] res = new int[26];
        for(int i = 0; i < ss.length; i++){
            int num1 = ss[i] - 'a';
            res[num1] += 1;
        }

        for(int j = 0; j < tt.length; j++){
            int num2 = tt[j] - 'a';
            res[num2] -= 1;
            if(res[num2] < 0){
                return false;
            }
        }
        return true;
    }
}


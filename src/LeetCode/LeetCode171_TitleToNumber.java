package LeetCode;
import java.util.HashMap;

public class LeetCode171_TitleToNumber {

    public static int titleToNumber(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int index = 0; index < 26; index++){
            map.put((char)(65 + index), index + 1);
        }
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            res += Math.pow(26, s.length() - 1 - i) * map.get(s.charAt(i));
        }
        return res;
    }

}

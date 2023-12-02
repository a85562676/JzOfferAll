package LeetCode;

import java.util.HashMap;

public class LeetCode0013_RomanToInt {

    public static int romanToInt(String s) {
        HashMap<Character,Integer> map =new HashMap<Character,Integer>();
        map.put('I', 1); map.put('V', 5);
        map.put('X', 10); map.put('L', 50);
        map.put('C', 100); map.put('D', 500);
        map.put('M', 1000);
        int index = 0;
        int sum = 0;

        while(index < s.length() && (index + 1) < s.length()){
            if(map.get(s.charAt(index)) < map.get(s.charAt(index + 1))){
                sum += map.get(s.charAt(index + 1)) -map.get(s.charAt(index));
                index = index + 2;
            }else{
                sum += map.get(s.charAt(index));
                index = index + 1;
            }
        }

        if(index == s.length() - 1){
            sum += map.get(s.charAt(index));
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XII"));
    }
}

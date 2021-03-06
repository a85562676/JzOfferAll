package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode412_fizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List resList = new ArrayList<String>();
        String str = "";
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0){
                str = str + "Fizz";
            }
            if(i % 5 == 0){
                str = str + "Buzz";
            }
            if(i % 5 != 0 && i % 3 != 0){
                str = str + String.valueOf(i);
            }
            resList.add(str);
            str = "";
        }
        return resList;
    }


}

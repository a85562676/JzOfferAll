package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118_PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> all = new ArrayList<List<Integer>>();
        all.add(new ArrayList<>());
        all.get(0).add(1);

        for(int rowNum = 1; rowNum < numRows; rowNum++){
            List<Integer> cur = new ArrayList<Integer>();
            List<Integer> pre = all.get(rowNum - 1);
            cur.add(1);
            for(int curRowNum = 1; curRowNum < rowNum; curRowNum++){
                cur.add(pre.get(curRowNum-1) + pre.get(curRowNum));
            }
            cur.add(1);
            all.add(cur);
        }
        return all;
    }
}

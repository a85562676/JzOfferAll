package interview;

import java.util.HashMap;

// 最大字符串匹配
public class Code1_solution {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        System.out.println(map);
        map.put("d", "5");
        System.out.println(map);
    }
}
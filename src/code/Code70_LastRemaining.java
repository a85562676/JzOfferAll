package code;// 约瑟夫环的问题

import java.util.LinkedList;

public class Code70_LastRemaining {
    //方法一 :通过链表来模拟
    public static int LastRemaining(int n, int m){
        if(n == 0 || m == 0)
            return -1;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        int removeIndex = 0;
        while(list.size() > 1){
            removeIndex = (removeIndex + m - 1) % list.size();
//            System.out.println(removeIndex);
            list.remove(removeIndex);
        }
        return list.get(0);
    }

    //方法一 :通过规律
    public static int LastRemaining1(int n, int m){
        // f(n,m) = (f(n-1, m) + m) % n
        // f(1) = 0  f(2) = (f(1) + m) % 2
        if(n ==0 || m ==0)
            return -1;
        int last = 0;
        for (int i = 2; i < n; i++){
            last = (last + m) % i;
        }
        return last;
    }

    public static void main(String[] args) {
        int i = LastRemaining(5, 3);
        int j = LastRemaining(5, 3);
        System.out.println(j);
    }
}

package Zuochengyunbook.Chapter8;

import java.util.TreeMap;

public class Code7_isContainsMatrix {

    public static boolean isContainsMatrix(int[][] matrix, int k) {

        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col > -1) {
            if (matrix[row][col] == k) {
                return true;
            } else if (matrix[row][col] > k) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] arr = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        boolean containsMatrix = isContainsMatrix(arr, 77);
        System.out.println(containsMatrix);


        TreeMap<String, Integer> stringIntegerTreeMap = new TreeMap<>();
        stringIntegerTreeMap.put("d", 4);
        stringIntegerTreeMap.put("e", 5);
        stringIntegerTreeMap.put("a", 1);
        stringIntegerTreeMap.put("b", 2);
        stringIntegerTreeMap.put("c", 3);
        stringIntegerTreeMap.put("f", 6);
        stringIntegerTreeMap.put("g", 7);

        System.out.println(stringIntegerTreeMap.firstEntry());
        stringIntegerTreeMap.pollFirstEntry();
        System.out.println(stringIntegerTreeMap.firstEntry());
        stringIntegerTreeMap.pollFirstEntry();
        System.out.println(stringIntegerTreeMap.firstEntry());
        stringIntegerTreeMap.pollFirstEntry();
        System.out.println(stringIntegerTreeMap.firstEntry());
        stringIntegerTreeMap.pollFirstEntry();
        System.out.println(stringIntegerTreeMap.firstEntry());
        stringIntegerTreeMap.pollFirstEntry();
        System.out.println(stringIntegerTreeMap.firstEntry());
        stringIntegerTreeMap.pollFirstEntry();


    }
}

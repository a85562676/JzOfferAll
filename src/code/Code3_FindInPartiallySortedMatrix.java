package code;

public class Code3_FindInPartiallySortedMatrix {

    public static boolean find(int target, int[][] array) {
        if (array == null) {
            return false;
        }
        int rows = array.length;
        int columns = array[0].length;

        int i = rows - 1;
        int j = 0;
        while (i >= 0 && j < columns) {
            if (array[i][j] == target) {
                return true;
            }
            if (array[i][j] < target) {
                ++j;
            } else {
                --i;
            }
        }
        return false;
    }
}

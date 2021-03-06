package LeetCode;
import java.util.HashSet;
import java.util.Set;

public class LeetCode217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for (int value : nums) {
            if (!s.add(value))
                return true;
        }
        return false;
    }
}

package easy;

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean flag = false;
        for (int i : nums) {
            if (!set.add(i)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

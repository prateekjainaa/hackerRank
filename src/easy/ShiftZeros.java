package easy;

public class ShiftZeros {

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count++;
            if (count != 0 && nums[i] != 0) {
                nums[i - count] = nums[i];
                nums[i] = 0;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        if (j == nums.length) {
            return;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void moveZeroesWithOrder(int[] nums) {

    }

    public static int removeDuplicates(int[] nums) {
        int uniquePosition = 0;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                uniquePosition++;
                nums[uniquePosition] = nums[i+1];
            }           
            
        }
        return uniquePosition+1;
    }

    public static void main(String[] args) {
        int[] nums = { 1,1,1,2,3,3,4,5};
        removeDuplicates(nums);
        for (int i : nums) {
            System.out.print(i + ",");
        }
    }

}

package Big_O_Basic_Arrays;

public class RightRotateOne {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        // Store last element
        int temp = nums[nums.length - 1];

        // Shift elements right
        for (int i = nums.length - 1; i > 0; i--) {

            nums[i] = nums[i - 1];
        }

        // Put last element at front
        nums[0] = temp;

        // Print rotated array
        for (int num : nums) {

            System.out.print(num + " ");
        }
    }
}

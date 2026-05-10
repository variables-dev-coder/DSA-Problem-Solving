package Big_O_Basic_Arrays;

public class LeftRotateOne {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        // Store first element
        int temp = nums[0];

        // Shift elements left
        for (int i = 0; i < nums.length - 1; i++) {

            nums[i] = nums[i + 1];
        }

        // Put first element at end
        nums[nums.length - 1] = temp;

        // Print rotated array
        for (int num : nums) {

            System.out.print(num + " ");
        }
    }
}

package Big_O_Basic_Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            // Non-zero element found
            if (nums[i] != 0) {

                // Swap
                int temp = nums[i];

                nums[i] = nums[j];

                nums[j] = temp;

                j++;
            }
        }

        // Print final array
        for (int num : nums) {

            System.out.print(num + " ");
        }
    }
}

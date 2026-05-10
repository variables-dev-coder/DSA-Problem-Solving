package Big_O_Basic_Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        int left = 0;

        int right = nums.length - 1;

        while (left < right) {

            // Swap elements
            int temp = nums[left];

            nums[left] = nums[right];

            nums[right] = temp;

            // Move pointers
            left++;

            right--;
        }

        // Print reversed array
        for (int num : nums) {

            System.out.print(num + " ");
        }
    }
}

package Big_O_Basic_Arrays;

public class LargestElement {

    public static void main(String[] args) {

        int[] nums = {4,7,1,9,3};

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > max) {

                max = nums[i];
            }
        }

        System.out.println("Largest Element: " + max);
    }
}

package Big_O_Basic_Arrays;

public class SmallestElement {

    public static void main(String[] args) {

        int[] nums = {5,2,9,1,7};

        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Update minimum
            if (nums[i] < min) {

                min = nums[i];
            }
        }

        System.out.println(
                "Smallest Element: " + min);
    }
}

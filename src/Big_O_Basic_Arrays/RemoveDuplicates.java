package Big_O_Basic_Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,4,4};

        // Edge case
        if (nums.length == 0) {

            System.out.println(0);

            return;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            // New unique element found
            if (nums[j] != nums[i]) {

                i++;

                nums[i] = nums[j];
            }
        }

        int uniqueCount = i + 1;

        System.out.println(
                "Unique Count: " + uniqueCount);

        // Print unique elements
        for (int k = 0; k < uniqueCount; k++) {

            System.out.print(nums[k] + " ");
        }
    }
}

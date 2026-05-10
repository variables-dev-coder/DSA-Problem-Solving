package Big_O_Basic_Arrays;

public class CheckSorted {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        boolean isSorted = true;

        for (int i = 0; i < nums.length - 1; i++) {

            // Check ascending order
            if (nums[i] > nums[i + 1]) {

                isSorted = false;

                break;
            }
        }

        System.out.println(
                "Is Sorted: " + isSorted);
    }
}

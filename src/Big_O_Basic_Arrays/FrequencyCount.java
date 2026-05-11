package Big_O_Basic_Arrays;

public class FrequencyCount {

    public static void main(String[] args) {

        int[] nums = {1,2,2,3,2,4};

        int target = 2;

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // Match found
            if (nums[i] == target) {

                count++;
            }
        }

        System.out.println(
                "Frequency: " + count);
    }
}

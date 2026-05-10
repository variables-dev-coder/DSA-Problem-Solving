package Big_O_Basic_Arrays;

public class SecondLargest {

    public static void main(String[] args) {

        int[] nums = {12,35,1,10,34,1};

        int largest = Integer.MIN_VALUE;

        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {

            // Update largest
            if (num > largest) {

                secondLargest = largest;

                largest = num;
            }

            // Update second largest
            else if (num > secondLargest
                    && num != largest) {

                secondLargest = num;
            }
        }

        // Check if second largest exists
        if (secondLargest == Integer.MIN_VALUE) {

            System.out.println(
                    "No second largest element");
        } else {

            System.out.println(
                    "Second Largest: "
                            + secondLargest);
        }
    }
}

package Big_O_Basic_Arrays;

public class EvenOddCount {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};

        int evenCount = 0;

        int oddCount = 0;

        for (int num : nums) {

            // Check even
            if (num % 2 == 0) {

                evenCount++;
            } else {

                oddCount++;
            }
        }

        System.out.println(
                "Even Count: " + evenCount);

        System.out.println(
                "Odd Count: " + oddCount);
    }
}

package Big_O_Basic_Arrays;

public class ArrayPalindrome {

    public static void main(String[] args) {

        int[] nums = {1,2,3,2,1};

        int left = 0;

        int right = nums.length - 1;

        boolean isPalindrome = true;

        while (left < right) {

            // Compare both sides
            if (nums[left] != nums[right]) {

                isPalindrome = false;

                break;
            }

            left++;

            right--;
        }

        System.out.println(
                "Is Palindrome: "
                        + isPalindrome);
    }
}

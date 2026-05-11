package Big_O_Basic_Arrays;

import java.util.HashSet;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] nums = {1,3,4,2,2};

        HashSet<Integer> set =
                new HashSet<>();

        int duplicate = -1;

        for (int num : nums) {

            // Duplicate found
            if (set.contains(num)) {

                duplicate = num;

                break;
            }

            set.add(num);
        }

        System.out.println(
                "Duplicate Element: "
                        + duplicate);
    }
}

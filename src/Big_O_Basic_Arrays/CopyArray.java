package Big_O_Basic_Arrays;

public class CopyArray {

    public static void main(String[] args) {

        int[] original = {1,2,3,4};

        int[] copy =
                new int[original.length];

        // Copy elements
        for (int i = 0; i < original.length; i++) {

            copy[i] = original[i];
        }

        // Print copied array
        for (int num : copy) {

            System.out.print(num + " ");
        }
    }
}

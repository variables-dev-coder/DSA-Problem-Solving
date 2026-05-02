package Big_O_Basic_Arrays;

/*
Problem 1: Search an element in array
Problem

Given array:

[10, 20, 30, 40, 50]

Find if 40 exists.


Thinking (Very important)

- Start from first element
- Compare each element with target
- If match → return index
- If not found → return -1

Algorithm

Loop from index 0 to n-1
If arr[i] == target → return i
End loop → return -1


Dry Run

Array: [10,20,30,40, 50], target = 40

i = 0 -> 10 ≠ 40
i = 1 -> 20 ≠ 40
i = 2 -> 30 ≠ 40
i = 3 -> 40 = 40 done index is 3

 */


public class SearchElement {

    public static int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50};

        System.out.println(search(arr, 40));   // 3 index
    }
}

/*
Complexity
Time: O(n)
Space: O(1)


 */
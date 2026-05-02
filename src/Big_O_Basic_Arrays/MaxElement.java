package Big_O_Basic_Arrays;

/*
Problem 2: Find Maximum Element
Problem

Find max in:

[5, 8, 2, 10, 3]

Thinking

 Assume first element is max
 Compare with others
 Update max if bigger found

 Algorithm
max = arr[0]
Loop from index 1
If arr[i] > max → update
Return max
 Dry Run

Array: [5,8,2,10,3]

max=5
8 > 5 → max=8
2 < 8 → skip
10 > 8 → max=10
3 < 10 → skip

 Answer = 10

 */


public class MaxElement {

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int [] arr = {5,8,2,10,3};

        System.out.println(findMax(arr));     // 10
    }
}

/*
Complexity
Time: O(n)
Space: O(1)
 */
package Big_O_Basic_Arrays;

/*
Problem 3: Sum of Array
Problem

Find sum:

[1,2,3,4]

Thinking

- Start sum = 0
- Add each element

 Algorithm

sum = 0
Loop through array
sum += arr[i]
Return sum Dry Run

Array: [1,2,3,4]

sum=0
sum=1
sum=3
sum=6
sum=10

👉 Answer = 10
 */
public class SumArray {

    public static int findSum(int [] arr) {

        int sum = 0;

        for (int num : arr) {

            sum += num;

        }

        return sum;
    }

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};

        System.out.println(findSum(arr));  // 15
    }
}

/*
Complexity
Time: O(n)
Space: O(1)
 */
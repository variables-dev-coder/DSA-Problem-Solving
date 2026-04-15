package Big_O_Basic_Arrays;

public class LinearSearchExample {
    public static void main(String[] args) {

        int[] arr = {4, 7, 1, 9, 3};
        int target = 9;

        int index = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println("Index of target: " + index);
    }
}

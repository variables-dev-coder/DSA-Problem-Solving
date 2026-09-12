package logicBuildingStarPatterns;

public class Right_Aligned_Decreasing_triangle {

    public static void main(String[] args) {

        //Row
        for (int row = 1; row <= 5; row++) {

            // Spaces
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }

            // Star
            for (int star = 1; star <= 6 - row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

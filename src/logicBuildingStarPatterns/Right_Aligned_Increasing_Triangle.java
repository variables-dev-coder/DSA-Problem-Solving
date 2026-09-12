package logicBuildingStarPatterns;

// Right-Aligned Increasing Triangle

public class Right_Aligned_Increasing_Triangle {

    public static void main(String[] args) {

        // Row
        for (int row = 1; row <= 5; row++) {

            // Spaces
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }

            // Star
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


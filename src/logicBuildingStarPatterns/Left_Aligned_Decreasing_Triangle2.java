package logicBuildingStarPatterns;

public class Left_Aligned_Decreasing_Triangle2 {

    public static void main(String[] args) {

        for (int rows = 1; rows <= 5; rows++) {

            System.out.print("Row " + rows + " -> ");

            for (int cols = 6 - rows; cols >= 1; cols--) {

                System.out.print(cols);
            }

            System.out.println();
        }
    }
}

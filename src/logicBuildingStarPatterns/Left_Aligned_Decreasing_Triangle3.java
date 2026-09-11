package logicBuildingStarPatterns;

public class Left_Aligned_Decreasing_Triangle3 {

    public static void main(String[] args) {

        for (int rows = 1; rows <= 5; rows++) {

            System.out.print("Row " + rows + " -> ");

            for (int cols = 1; cols <= 6 - rows; cols++) {

                System.out.print(cols);

                if (cols < 6 - rows) {
                    System.out.print(", ");
                }
            }

            System.out.println();
        }
    }
}

package logicBuildingStarPatterns;

public class SolidRectangle {

    public static void main(String[] args) {

        int rows = 4;
        int cols = 6;

        for(int row = 1; row <= rows; row++) {

            for (int col = 1; col <= cols; col++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}

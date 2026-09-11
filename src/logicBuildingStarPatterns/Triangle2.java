package logicBuildingStarPatterns;

public class Triangle2 {

    public static void main(String[] args) {

        for (int rows = 1; rows <= 5; rows++) {

            for (int cols = 1; cols <= rows; cols++) {

                System.out.print(cols);

                if (cols < rows) {
                    System.out.print(",");
                }
            }

            System.out.println();
        }
    }
}

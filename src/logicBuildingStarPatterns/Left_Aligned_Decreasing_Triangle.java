package logicBuildingStarPatterns;

public class Left_Aligned_Decreasing_Triangle {

    public static void main(String[] args) {

        for (int rows = 1; rows <= 5; rows++) {

            for (int cols = 5; cols >= rows; cols--) {

                System.out.print("*");
            }

            System.out.println();
        }

    }
}

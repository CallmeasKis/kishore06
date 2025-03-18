public class HalloGlassPattern {

    public static void printHalloGlass(int rows) {
        if (rows <= 0) {
            System.out.println("Number of rows should be positive.");
            return;
        }

        // Upper part of the glass
        for (int i = 1; i <= rows; i++) {
            // Spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Stars for the upper part
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the glass
        for (int i = rows - 1; i >= 1; i--) { // Start from rows-1 to avoid repeating the middle row
            // Spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Stars for the lower part
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows here
        printHalloGlass(rows);
    }
}
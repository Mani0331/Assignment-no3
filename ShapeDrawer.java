public class ShapeDrawer {
    public static void main(String[] args) {
        drawRectangle(5, 10);
        System.out.println();
        drawTriangle(5);
        System.out.println();
        drawRightAlignedTriangle(5);
        System.out.println();
        drawPyramid(5);
    }

    // Method to draw a rectangle of '*' characters
    public static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to draw a triangle of '*' characters
    public static void drawTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to draw a right-aligned triangle of '*' characters
    public static void drawRightAlignedTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to draw a pyramid of '*' characters
    public static void drawPyramid(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
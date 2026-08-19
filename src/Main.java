public class Main {
    public static void main(String[] args) {

        int n = 7;

        for (int row = 1; row <= n; row++) {

            //pattern - hollow triangle

            if (row == 1) {

                for (int space = 1; space <= n - row; space++) {
                    System.out.print("  ");
                }

                System.out.print("* ");

            } else if (row <= n - 1) {

                // space
                for (int space = 1; space <= n - row; space++) {
                    System.out.print("  ");
                }

                //start
                System.out.print("* ");

                //middle
                for (int middle = 1; middle <= 2 * row - 3; middle++) {
                    System.out.print("  ");
                }

                //end
                System.out.print("* ");

            } else {
                for (int col = 1; col <= 2*n-1; col++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
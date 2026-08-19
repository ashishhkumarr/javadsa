public class Main {
    public static void main(String[] args) {

        int n = 7;

        for (int row = 1; row <= n; row++) {

            //pattern - hollow triangle

            //part 1 - spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            if (row == 1 || row == n) {
                for (int col = 1; col <= 2*row-1; col++) {
                    System.out.print("* ");
                }

            } else {

                //start
                System.out.print("* ");

                //middle
                for (int middle = 1; middle <= 2 * row - 3; middle++) {
                    System.out.print("  ");
                }

                //end
                System.out.print("* ");

            }

            System.out.println();
        }
    }
}
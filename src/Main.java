public class Main {
    public static void main(String[] args) {

        int n = 9;

        for(int row = 1; row <= n; row++){

            //pattern - hollow triangle

            if(row == 1 || row == 2 || row == n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }

            } else {

                System.out.print("* ");

                for (int col = 1; col <= row-2; col++) {
                    System.out.print("  ");
                }

                System.out.print("* ");

            }

            System.out.println();
        }

    }
}
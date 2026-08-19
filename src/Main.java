public class Main {
    public static void main(String[] args) {

        int n = 4;

        for(int row = 1; row <= n; row++) {
            // spaces
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        for(int row = 1; row <= n; row++){

            if(row == 1){
                continue;
            }

            //spaces
            for(int spaces = 1; spaces <= row - 1; spaces++){
                System.out.print("  ");
            }

            //stars
            for(int col = 1; col <= (2*n-row)-(row-1); col++){
                System.out.print("* ");
            }

            System.out.println();

        }







    }
}
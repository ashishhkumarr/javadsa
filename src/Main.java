public class Main {
    public static void main(String[] args) {

        int n = 9;

        for(int row = 1; row <= n; row++){

            //spaces

            for(int spaces = 1; spaces <= (n-row); spaces++){
                System.out.print("  ");
            }

            //pattern-stars
            for(int col = 1; col <= (2*row)-1; col++){
                System.out.print("* ");
            }

            System.out.println();
        }





    }
}
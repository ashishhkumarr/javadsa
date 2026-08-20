public class hollowpyramid {

        public static void main(String[] args) {

            int n = 4;

            for(int row = 1; row <= n; row++) {

                // spaces
                for (int space = 1; space <= n - row; space++) {
                    System.out.print("  ");
                }

                if (row == 1) {
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

            // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| //

            for(int row = 1; row <= n; row++){

                if(row == 1){
                    continue;
                }

                //spaces
                for(int spaces = 1; spaces <= row - 1; spaces++){
                    System.out.print("  ");
                }

                if(row <= n-1) {

                    //start
                    System.out.print("* ");

                    //middle
                    for (int middle = 1; middle <= 2*(n-row) - 1; middle++) {
                        System.out.print("  ");
                    }

                    //end
                    System.out.print("* ");

                }
                else {

                    System.out.println("* ");

                }

                System.out.println();


            }

        }
    }


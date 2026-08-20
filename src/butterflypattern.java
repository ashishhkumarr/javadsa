public class butterflypattern {

    public static void main(String[] args) {

        int n = 5;
        for(int row = 1; row <= n; row++){

            //stars
            for(int stars = 1; stars <= row; stars++){
                System.out.print("* ");
            }


            //middle

            for(int middle = 1; middle <= 2*n-(row+row); middle++){
                System.out.print("  ");
            }

            //stars
            for(int stars = 1; stars <= row; stars++){
                System.out.print("* ");
            }

            System.out.println();
        }

        //|||||||||||||||||

        for(int row = 1; row <= n; row++){

            //stars
            for(int stars = 1; stars <= n-row+1; stars++){
                System.out.print("* ");
            }


            //middle

            for(int middle = 1; middle <= 2*row-2; middle++){
                System.out.print("  ");
            }

            //stars
            for(int stars = 1; stars <= n-row+1; stars++){
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}

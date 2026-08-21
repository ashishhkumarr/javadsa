public class NumberPattern {
        public static void main(String[] args) {

            int n = 5;

//            // --------- Right Angle Triangle Number Pattern --------- //
//            for(int row = 1; row <= n; row++){
//
//                for(int col = 1; col <= row; col++){
//                    System.out.print(col + " ");
//                }
//
//                System.out.println();
//            }

//            // Floyd's Triangle Pattern
//            int count = 1;
//            for(int row = 1; row <= n; row++){
//
//                for(int col = 1; col <= row; col++){
//                    System.out.print(count + " ");
//                    count++;
//                }
//
//                System.out.println();
//            }

           // System.out.println('A' - 1);



            // Alphabet Triangle Pattern
            for(int row = 1; row <= n; row++){

                for(int col = 1; col <= row; col++){
                    int a = col + ('A' - 1);
                    System.out.print((char)(a) + " ");
                }
                System.out.println();
            }

        }
    }


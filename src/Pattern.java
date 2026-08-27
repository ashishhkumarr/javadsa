public class Pattern {

    public static void main(String[] args) {

        int n = 6;


        for(int row = 1; row <= n; row++){

            int num = 1;
            for(int col = 1; col <= row; col++){

                System.out.print(num + " ");
                num++;

            }

            System.out.println();
        }
    }
}

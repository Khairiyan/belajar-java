public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.print("index ke-" + i);
            for (int j = 0; j < 9; j++) {
                if (i == j) {
                    break;
                } else if (j + i == 9) {
                    break;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 9; i++) {
            for (int k = 9; k > i; k--) {
                System.out.print(" ");

            }
            // System.out.print(" ");

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 8; i >= 1; i--) {
            for (int k = i - 1; k < 9; k++) {
                if (k == 9 || k == 8) {
                    break;
                }
                System.out.print(" ");
            }
            // System.out.print("index ke-" + i);
            for (int j = i; j > 0; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 9; i++) {
            for (int k = 9; k > i; k--) {
                System.out.print(" ");
            }
            // System.out.print(" ");

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 8; i >= 1; i--) {
            for (int k = 9; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int batasLoop = 10;

        for (int i = 1; i <= batasLoop; i++) {
            // System.out.print("index ke-" + i);
            for (int j = batasLoop; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = batasLoop; i > 1; i--) {
            // System.out.print("index ke-" + i);
            for (int k = i - 1; k < batasLoop; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= batasLoop; i++) {
            // System.out.print("index ke-" + i);
            for(int k = batasLoop; k > i; k--){
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = batasLoop - 1; i >= 1; i--){
            for(int k = batasLoop - 1; k >= i; k--){
                System.out.print(" ");
            }

            for(int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= batasLoop; i++ ){
            for(int k = batasLoop; k > i; k--){
                System.out.print(" ");
            }

            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = batasLoop - 1; i >= 1; i--){
            // System.out.print("index ke-" + i);
            for(int k = batasLoop; k > i; k--){
                System.out.print(" ");
            }

            for(int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        // int tinggiSegitiga = 5;

        // for (int i = 0; i < tinggiSegitiga; i++) {
        // for (int j = tinggiSegitiga - i; j > 1; j--) {
        // System.out.print(" ");
        // }

        // for (int k = 0; k < 2 * i + 1; k++) {
        // System.out.print(k);
        // }

        // System.out.println();
        // }

        // for (int i = tinggiSegitiga; i >= 0; i--) {

        // for (int j = tinggiSegitiga - i; j > 1; j--) {
        // System.out.print(" ");
        // }

        // if (i == 5) {
        // continue;
        // } else {
        // for (int k = 0; k < i * 2 + 1; k++) {
        // System.out.print("*");
        // }
        // }

        // System.out.println();
        // }

        // System.out.println(penjumlahan(6, 7));
        // selamatMalam("Riyan");

    }

    // private static int penjumlahan(int a, int b) {
    // return a + b;
    // }

    // private void selamatMalam(String nama) {
    // System.out.println("Selamat malam : " + nama);
    // }
}
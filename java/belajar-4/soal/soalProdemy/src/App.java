public class App {
    public static void main(String args[]) throws Exception {
        int arrayAngka[] = { 23, 5, 6, 12, 78, 9, 19 };

        for (int i = 0; i < arrayAngka.length; i++) {
            // System.out.println(arrayAngka[i]);

        }
        System.out.println(ambilAngkaTerkecil(arrayAngka));
        System.out.println("=================================");
        System.out.println(ambilAngkaTerbesar(arrayAngka));
        

    }

    public static int ambilAngkaTerkecil(int[] angkaInput) {
        int tempAngkaPindah = 0;
        int size = angkaInput.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                // System.out.print(j + " ");
                if (angkaInput[j] > angkaInput[j + 1]) {
                    tempAngkaPindah = angkaInput[j];
                    angkaInput[j] = angkaInput[j + 1];
                    angkaInput[j + 1] = tempAngkaPindah;
                }
            }
        }

        return angkaInput[0];
    }

    public static int ambilAngkaTerbesar(int[] angkaInput) {
        int tempAngkaPindah = 0;
        int size = angkaInput.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (angkaInput[j] < angkaInput[j + 1]) {
                    tempAngkaPindah = angkaInput[j];
                    angkaInput[j] = angkaInput[j + 1];
                    angkaInput[j + 1] = tempAngkaPindah;
                }
            }
        }

        return angkaInput[0];
    }
}
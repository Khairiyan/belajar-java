public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a = 10;
        int b = 5;
        int c = 0;

        c = b;
        b = a;
        a = c;

        System.out.println("a = " + a + " dan b = " + b );
    }
}

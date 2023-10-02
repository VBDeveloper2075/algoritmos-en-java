public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.printf("%d %d ", a, b);
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.printf("%d ", c);
            a = b;
            b = c;
        }
    }
}

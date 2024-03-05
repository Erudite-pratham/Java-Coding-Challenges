package Day3;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5, i;
        for (i = 0; i <= n - 1; i++) {
            System.out.print(factorial(n - 1) / (factorial(n - 1 - i) * factorial(i)) + " ");
        }
    }

    public static int factorial(int i) {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
}

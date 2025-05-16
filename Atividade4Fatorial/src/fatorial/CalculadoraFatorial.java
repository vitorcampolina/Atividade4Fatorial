package fatorial;

public class CalculadoraFatorial {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número deve ser positivo.");
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

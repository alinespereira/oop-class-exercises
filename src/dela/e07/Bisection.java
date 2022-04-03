package dela.e07;

import dela.Solution;

public class Bisection {
    private static final double tolerance = 1e-7;

    public static double func(double x) {
        return Math.pow(x, 3) - Math.pow(x, 2) - 13 * x + 8;
    }

    private static Solution solve(double a, double b, int iterations) {
        double c = (a + b) / 2;
        if (Math.abs(func(c)) < tolerance) {
            return new Solution(c, iterations);
        } else {
            if (func(a) * func(c) < 0) {
                return solve(a, c, iterations + 1);
            } else {
                return solve(b, c, iterations + 1);
            }
        }
    }

    public static Solution solve(double a, double b) {
        return solve(a, b, 0);
    }

    public static void main(String[] args) {
        Solution sol = solve(-4, -3);
        System.out.println(sol);
    }
}

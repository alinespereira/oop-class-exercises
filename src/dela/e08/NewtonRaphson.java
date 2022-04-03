package dela.e08;

import dela.Solution;
import intro.Reader;

public class NewtonRaphson {
    private static final double tolerance = 1e-7;
    private static final Reader reader = new Reader("newton raphson");

    public static double func(double x) {
        return Math.pow(x, 3) - Math.pow(x, 2) - 13 * x + 8;
    }

    public static double dFunc(double x) {
        return 3 * Math.pow(x, 2) - 2 * x - 13;
    }

    private static double iterate(double x0) {
        return x0 - func(x0) / dFunc(x0);
    }

    private static Solution solve(double x0, int iterations) {
        double x1 = iterate(x0);
        if (Math.abs(x1 - x0) < tolerance) {
            return new Solution(x1, iterations + 1);
        } else {
            return solve(x1, iterations + 1);
        }
    }

    public static Solution solve(double x0) {
        return solve(x0, 0);
    }

    public static void main(String[] args) {
        System.out.print("Please provide an initial guess: ");
        double x0 = reader.readDouble();
        Solution sol = solve(x0);
        System.out.println(sol);
    }
}

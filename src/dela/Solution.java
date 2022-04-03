package dela;

public class Solution {
    private int iterations;
    private double answer;

    public Solution(double answer, int iterations) {
        this.answer = answer;
        this.iterations = iterations;
    }

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "x = " + answer + " (after " + iterations + " iterations)";
    }
}

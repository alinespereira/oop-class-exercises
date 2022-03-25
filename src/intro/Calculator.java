package intro;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    private final Stack<Double> stack;
    private final Scanner keyboard;

    public Calculator() {
        this.stack = new Stack<>();
        this.keyboard = new Scanner(System.in);
    }

    public void run() throws Exception {
        while (keyboard.hasNext()) {
            if (keyboard.hasNextDouble()) {
                stack.push(keyboard.nextDouble());
            } else {
                double op1, op2;
                switch (keyboard.next()) {
                    case "+":
                        op1 = stack.pop();
                        op2 = stack.pop();
                        stack.push(op1 + op2);
                        break;
                    case "-":
                        op1 = stack.pop();
                        op2 = stack.pop();
                        stack.push(op1 - op2);
                        break;
                    case "*":
                        op1 = stack.pop();
                        op2 = stack.pop();
                        stack.push(op1 * op2);
                        break;
                    case "/":
                        op1 = stack.pop();
                        op2 = stack.pop();
                        stack.push(op1 / op2);
                        break;
                    default:
                        break;
                }
                System.out.println("Peek: " + stack.peek());
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        calc.run();
    }
}

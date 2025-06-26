import java.util.Scanner;

public class Calculator {
    double a, b;
    String operation;

    // Method to get input from the user
    void inputValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        b = sc.nextDouble();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        operation = sc.next();
    }

    // Method to perform the operation
    void calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result = " + (a + b));
                break;
            case "subtract":
                System.out.println("Result = " + (a - b));
                break;
            case "multiply":
                System.out.println("Result = " + (a * b));
                break;
            case "divide":
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Use add, subtract, multiply or divide.");
        }
    }

    // main method
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.inputValues();
        calc.calculate();
    }
}

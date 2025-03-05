import java.util.Scanner;

class Calculator {
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; 
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(); 
        int choice;
        
        do {
            
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            if (choice >= 1 && choice <= 3) {
                // Input two numbers
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + calculator.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + divide(num1, num2));
                        break;
                }
            } else if (choice != 4) {
                System.out.println("Invalid choice! Please try again.");
            }
            
        } while (choice != 4);
        
        System.out.println("Calculator exited. Goodbye!");
        scanner.close();
    }
}

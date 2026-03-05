package MathOperations; // Create the package as required

public class Q3 {
    
    // Method to perform operations using the built-in Math class
    public void performOperations(double number) {
        System.out.println("Input Number: " + number);
        
        // Using Java's built-in Math class methods
        System.out.println("Floor value: " + Math.floor(number)); // Largest integer <= number
        System.out.println("Ceil value : " + Math.ceil(number));  // Smallest integer >= number
        System.out.println("Round value: " + Math.round(number)); // Closest integer
    }

    public static void main(String[] args) {
        MathDemo demo = new MathDemo();
        
        System.out.println("--- Testing Math Operations ---");
        demo.performOperations(15.7);
        
        System.out.println("\n--- Testing with another value ---");
        demo.performOperations(12.2);
    }
}

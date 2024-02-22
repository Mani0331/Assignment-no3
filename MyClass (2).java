public class MyClass {
    public static void main(String[] args) {
        int currentValue = 5;
        System.out.println("Current value is: " + currentValue);

        int factorial = 1;

        for (int i = 1; i <= currentValue; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + currentValue + " is: " + factorial);
    }
}
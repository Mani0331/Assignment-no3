public class MyClass {
    public static void main(String[] args) {
        int currentValue = 5;
        System.out.println("Current value is: " + currentValue);

        int factorial = 1;
        int i = 1;

        while (i <= currentValue) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + currentValue + " is: " + factorial);
    }
}
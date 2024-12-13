package OOP.Exceptions.IllegalArgumentExceptionDemo;

public class IllegalArgumentExceptionDemo {
    // A method that validates input and throws IllegalArgumentException
    public static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150.");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        try {
            setAge(200); // This will throw the exception
        } catch (IllegalArgumentException e) {
            System.err.println("Caught an IllegalArgumentException: " + e.getMessage());
        }

        try {
            setAge(25); // This will succeed
        } catch (IllegalArgumentException e) {
            System.err.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }
}

// Custom exception class that inherits from Exception
class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

// Custom exception class that inherits from ExceptionA
class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

// Main class to demonstrate catching various exceptions
public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("This is ExceptionA");
            // throw new ExceptionB("This is ExceptionB");
            // throw new NullPointerException("This is a NullPointerException");
            // throw new IOException("This is an IOException");
        } catch (Exception exception) {
            System.out.println("Caught an exception: " + exception.getMessage());
        }
    }
}
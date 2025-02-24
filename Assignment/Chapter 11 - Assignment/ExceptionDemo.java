// Superclass for exceptions
class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

// Subclass of ExceptionA
class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

// Subclass of ExceptionB
class ExceptionC extends ExceptionB {
    public ExceptionC(String message) {
        super(message);
    }
}

// Main class to demonstrate catching exceptions
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Uncomment one of the following lines to test different exceptions
            // throw new ExceptionB("This is ExceptionB");
            throw new ExceptionC("This is ExceptionC");
        } catch (ExceptionA e) {
            // This block will catch ExceptionB and ExceptionC
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
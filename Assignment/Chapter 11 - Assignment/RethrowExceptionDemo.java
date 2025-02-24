public class RethrowExceptionDemo {
    public static void someMethod2() throws Exception {
        throw new Exception("Exception from someMethod2");
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Caught in someMethod, rethrowing...");
            throw e; // Rethrow the exception
        }
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Caught rethrown exception: " + e.getMessage());
            e.printStackTrace(); // Print stack trace
        }
    }
}